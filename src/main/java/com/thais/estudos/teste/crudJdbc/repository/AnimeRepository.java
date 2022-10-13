package com.thais.estudos.teste.crudJdbc.repository;


import com.thais.estudos.teste.crudJdbc.conn.ConnectionFactory;
import com.thais.estudos.teste.crudJdbc.dominio.Anime;
import com.thais.estudos.teste.crudJdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class AnimeRepository {
    public static List<Anime> findByName(String name) {
        log.info("Finding Producers By Name '{}'", name);
        List<Anime> animes = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnect(); PreparedStatement ps = createdPreparedStatementFindByName(conn, name); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Producer producer = Producer.builder().name(rs.getString("producer_name"))
                        .id(rs.getInt("producer_id")).build();
                Anime anime = Anime.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .episodes(rs.getInt("episodes"))
                        .producer(producer)
                        .build();
                animes.add(anime);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all anime", e);

        }
        return animes;
    }

    public static void delete(int id) {

        try (Connection conn = ConnectionFactory.getConnect(); PreparedStatement ps = createdPreparedStatementDelete(conn, id)) {
            ps.executeUpdate();
            log.info("Deleted anime '{}' from the database", id);
            //            System.out.println(rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to delete anime '{}'", id, e);

        }
    }

    public static void save(Anime anime) {
        log.info("Saving anime '{}'", anime);
        try (Connection conn = ConnectionFactory.getConnect(); PreparedStatement ps = createPreparedStatementSave(conn, anime)) {
            ps.execute();

        } catch (SQLException e) {
            log.error("Error while trying to update anime '{}'", anime.getId(), e);

        }
    }

    public static Optional<Anime> findById(Integer id) {
        log.info("Finding Producers By Id '{}'", id);

        try (Connection conn = ConnectionFactory.getConnect(); PreparedStatement ps = createdPreparedStatementFindById(conn, id); ResultSet rs = ps.executeQuery()) {
            if (!rs.next()) Optional.empty();
            Producer producer = Producer.builder().name(rs.getString("producer_name"))
                    .id(rs.getInt("producer_id")).build();
            Anime anime = Anime.builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .episodes(rs.getInt("episodes"))
                    .producer(producer)
                    .build();
            return Optional.of(anime);

        } catch (SQLException e) {
            log.error("Error while trying to find all anime", e);

        }
        return Optional.empty();
    }

    public static void update(Anime anime) {
        log.info("updating anime '{}'", anime);
        try (Connection conn = ConnectionFactory.getConnect(); PreparedStatement ps = createPreparedStatementUpdate(conn, anime)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update anime '{}'", anime.getId(), e);

        }
    }

    private static PreparedStatement createPreparedStatementSave(Connection conn, Anime anime) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`anime` (`name`, `episodes`, `producer_id`) VALUES (?, ?, ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getEpisodes());
        ps.setInt(3, anime.getProducer().getId());

        return ps;
    }

    private static PreparedStatement createdPreparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT a.id, a.name, a.episodes, a.producer_id, p.name as 'producer_name' FROM anime_store.anime a inner join where a.name like ?; ";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        return ps;
    }

    private static PreparedStatement createdPreparedStatementDelete(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM `anime_store`.`anime` WHERE (`id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    private static PreparedStatement createdPreparedStatementFindById(Connection conn, Integer id) throws SQLException {
        String sql =  "SELECT a.id, a.name, a.episodes, a.producer_id, p.name as 'producer_name' FROM anime_store.anime a inner join where a.name = ?; ";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    private static PreparedStatement createPreparedStatementUpdate(Connection conn, Anime anime) throws SQLException {
        String sql = "UPDATE 'anime_store'.'anime' SET 'name' = ?, 'episodes' = ? WHERE ('id' = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getEpisodes());
        ps.setInt(3, anime.getId());
        return ps;
    }
}
