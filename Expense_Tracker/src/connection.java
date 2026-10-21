/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.expense_tracker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class connection {
    public static Connection c;
    public static Statement s;

    static {
        try {
            // Database connection
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/expense_tracker_db", "root", "1234");
            s = c.createStatement();
            System.out.println("Database connection established successfully.");
        } catch (Exception e) {
            // Log error to console
            System.err.println("Database connection failed: " + e.getMessage());
        }
    }

    // Optional: Add a method to close resources
    public static void close() {
        try {
            if (s != null) s.close();
            if (c != null) c.close();
            System.out.println("Database connection closed.");
        } catch (Exception e) {
            System.err.println("Error closing database resources: " + e.getMessage());
        }
    }

    static PreparedStatement prepareStatement(String query) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
