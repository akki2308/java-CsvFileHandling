package com.bridgelabz.csv;


import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicateCSV {
    public static void main(String[] args) {
        String filePath = "students.csv";
        Set<String> ids = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                String id = fields[0];

                if (!ids.add(id)) {
                    duplicates.add(line);
                }
            }

            // Print duplicate entries
            if (duplicates.isEmpty()) {
                System.out.println("No duplicate records found based on ID.");
            } else {
                System.out.println("Duplicate Records:\n");
                for (String dup : duplicates) {
                    System.out.println(dup);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
