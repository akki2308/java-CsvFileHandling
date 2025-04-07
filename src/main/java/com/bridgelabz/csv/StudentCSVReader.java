package com.bridgelabz.csv;

import java.io.*;

public class StudentCSVReader {
    public static void main(String[] args) {
        String line;
        String filePath = "students.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            System.out.println("Student Details:\n");

            while ((line = br.readLine()) != null) {
                // Split line into fields
                String[] values = line.split(",");

                // Extract and display the fields
                String id = values[0];
                String name = values[1];
                String age = values[2];
                String marks = values[3];

                // Print in structured format
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Marks: " + marks);

                System.out.println("--------------------------");
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            //e.printStackTrace();
        }
    }
}
