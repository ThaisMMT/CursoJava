package com.thais.estudos.teste.crudJdbc.repository;


import com.thais.estudos.teste.crudJdbc.conn.ConnectionFactory;
import com.thais.estudos.teste.crudJdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class ProducerRepository {
    public static List<Producer> findByName(String name) {
        log.info("Finding Producers By Name '{}'", name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnect(); PreparedStatement ps = createdPreparedStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Producer producer = Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producer", e);

        }
        return producers;
    }

    public static void delete(int id) {

        try (Connection conn = ConnectionFactory.getConnect(); PreparedStatement ps = createdPreparedStatementDelete(conn, id)) {
            ps.executeUpdate();
            log.info("Deleted producer '{}' from the database", id);
            //            System.out.println(rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id, e);

        }
    }

    public static void save(Producer producer) {
        log.info("Saving producer '{}'", producer);
        try (Connection conn = ConnectionFactory.getConnect();
             PreparedStatement ps = createPreparedStatementSave(conn, producer)) {
            ps.execute();

        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);

        }
    }

    public static Optional<Producer> findById(Integer id) {
        log.info("Finding Producers By Id '{}'", id);

        try (Connection conn = ConnectionFactory.getConnect(); PreparedStatement ps = createdPreparedStatementFindById(conn, id);
             ResultSet rs = ps.executeQuery()) {
            if (!rs.next()) Optional.empty();
            return Optional.of(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

        } catch (SQLException e) {
            log.error("Error while trying to find all producer", e);

        }
        return Optional.empty();
    }

    public static void update(Producer producer) {
        log.info("updating producer '{}'", producer);
        try (Connection conn = ConnectionFactory.getConnect();
             PreparedStatement ps = createPreparedStatementUpdate(conn, producer)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);

        }
    }

    private static PreparedStatement createPreparedStatementSave(Connection conn, Producer producer) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES (?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());

        return ps;
    }

    private static PreparedStatement createdPreparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        return ps;
    }

    private static PreparedStatement createdPreparedStatementDelete(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    private static PreparedStatement createdPreparedStatementFindById(Connection conn, Integer id) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where id = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    private static PreparedStatement createPreparedStatementUpdate(Connection conn, Producer producer) throws SQLException {
        String sql = "UPDATE 'anime_store'.'producer' SET 'name' = ? WHERE ('id' = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;
    }
}
