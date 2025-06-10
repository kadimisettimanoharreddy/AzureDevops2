package com.mobile.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc {
    static Connection jdbcconnection() throws ClassNotFoundException, SQLException {
        
        String url = "jdbc:mysql://localhost:3306/newdb";  // Your database name
        String user = "root";       // Assuming root user
        String password = "Manohar6464";   // Your password
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("Connection created successfully");
        
        return con;
    }
}


