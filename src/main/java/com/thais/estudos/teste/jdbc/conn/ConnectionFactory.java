package com.thais.estudos.teste.jdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
//    java.sql = Connection, Statement, Result, DriveManager

    public  static Connection getConnect() throws SQLException {
        String url = "jdbc:mysql://localhost:3307/anime_store";
        String username = "root";
        String password = "root";

        return DriverManager.getConnection(url,username,password);
    }


}
