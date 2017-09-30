package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
    static {
       // 1、加载驱动 Class.forName("");
       try {
           Class.forName("com.mysql.jdbc.Driver");
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
    }
    
    // 2、获取连接对象Connection
    public static Connection getConnection() throws SQLException {
       return DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/studentmanagmentsystem", "root", "root");
    }
    // 6、关闭
    public static void close(Connection connection, Statement statement) {
       if (statement != null) {
           try {
               statement.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
       if (connection != null) {
           try {
               connection.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
    }
    
    // 6、关闭
    public static void close(Connection connection, Statement statement, ResultSet resultSet) {
       if (resultSet != null) {
           try {
               resultSet.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
       if (statement != null) {
           try {
               statement.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
       if (connection != null) {
           try {
               connection.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
    }
}

