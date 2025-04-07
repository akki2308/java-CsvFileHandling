package com.bridgelabz.csv;

import java.io.*;

public class CountRows {
    public static void main(String[] args) {
        String filePath = "employees.csv";
        int recordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read and skip the header line
            br.readLine();

            // Count each remaining line
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    recordCount++;
                }
            }

            System.out.println("Number of records (excluding header): " + recordCount);

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

