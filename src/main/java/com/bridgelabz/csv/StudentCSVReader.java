package com.bridgelabz.csv;

import java.io.*;

public class StudentCSVReader {
    public static void main(String[] args) {
        String line;
        String filePath = "students.csv"; // set the path to your csv file

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            System.out.println("Student Details:\n");

            while ((line = br.readLine()) != null) {  //Read Line by Line
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




//import com.opencsv.CSVReader;
//        import java.io.FileReader;
//        import java.io.IOException;
//
//public class ReadStudentCSVWithOpenCSV {
//    public static void main(String[] args) {
//        String filePath = "students.csv";   // set the path to your csv file
//
//        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
//            String[] line;
//
//            reader.readNext(); // skip header
//
//            System.out.println("Student Records:\n");
//
//            while ((line = reader.readNext()) != null) {
//                System.out.println("ID    : " + line[0]);
//                System.out.println("Name  : " + line[1]);
//                System.out.println("Age   : " + line[2]);
//                System.out.println("Marks : " + line[3]);
//                System.out.println("-------------------------");
//            }
//
//        } catch (IOException e) {
//            System.out.println("Error reading file: " + e.getMessage());
//        }
//    }
//}
