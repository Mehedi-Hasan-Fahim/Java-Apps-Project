package com.mycompany.expense_tracker;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.*;
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) {
        // Test Apache POI by creating an Excel file
        //testApachePOI();

        // Create a simple login frame (assuming the Login class exists)
        new Login().setVisible(true);
    }

    // Method to test Apache POI functionality
    public static void testApachePOI() {
        try {
            // Create a workbook and sheet
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Test Data");

            // Create a row and add some cells
            Row row = sheet.createRow(0);
            row.createCell(0).setCellValue("ID");
            row.createCell(1).setCellValue("Name");
            row.createCell(2).setCellValue("Amount");

            // Adding data to the next row
            row = sheet.createRow(1);
            row.createCell(0).setCellValue(1);
            row.createCell(1).setCellValue("Test User");
            row.createCell(2).setCellValue(1000);

            // Writing to an Excel file
            try (FileOutputStream fileOut = new FileOutputStream("test_expenses.xlsx")) {
                workbook.write(fileOut);
                JOptionPane.showMessageDialog(null, "Excel file created successfully!");
            }

            // Close the workbook
            workbook.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error creating Excel file: " + e.getMessage());
        }
    }
}
