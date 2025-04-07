package com.bridgelabz.csv;

import java. io.*;
public class FilterScore {
    public static void main(String[] args) {
        String line;
        String filepath = "students.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            System.out.println("Students who scored more than 80");

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                if (values.length < 3) continue;
                int marks = Integer.parseInt(values[3].trim());

                if (marks > 80) {
                    System.out.println("ID: " + values[0] + ", Name: " + values[1] + ", Age: " + values[2] + ", Marks: " + values[3]);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in CSV.");
            e.printStackTrace();
        }
    }
}
