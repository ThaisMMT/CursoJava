package com.thais.estudos.teste.jdbc.repository;

import com.thais.estudos.teste.jdbc.conn.ConnectionFactory;
import com.thais.estudos.teste.jdbc.dominio.Producer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProducerRepository {
    public static void save(Producer producer){
        String sql = String.format("INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');", producer.getName());
        try(Connection conn = ConnectionFactory.getConnect();
            Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
