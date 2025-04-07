package com.bridgelabz.csv;

import java.io.FileWriter;
import java.io.IOException;

public class WriteEmployeeCSV {
    public static void main(String[] args) {
        String filePath = "employees.csv";

        try (FileWriter writer = new FileWriter(filePath)) {

            // Write header
            writer.write("ID,Name,Department,Salary\n");

            // Write 5 employee records
            writer.write("E101,Akshit,Sales,50000\n");
            writer.write("E102,Srishti,Marketing,55000\n");
            writer.write("E103,Harshit,HR,48000\n");
            writer.write("E104,Prathna,IT,60000\n");
            writer.write("E105,Harsh,Finance,62000\n");

            System.out.println("CSV file written successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
