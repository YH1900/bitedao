package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class jdbcUtil {
    /*private final static String URL="jdbc:mysql://116.196.91.187:3306/yan";*/
    private final static String URL = "jdbc:mysql://rm-m5e73cj7veebn3c58ao.mysql.rds.aliyuncs.com:3306/bocai";
    private final static String USER = "bocai";
    private final static String PASSWORD = "418206Ab418206";

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            return con;
        } catch (ClassNotFoundException | SQLException e) {
        }
        return con;
    }
}

