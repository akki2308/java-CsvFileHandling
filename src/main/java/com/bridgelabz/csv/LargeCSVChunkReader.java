package com.bridgelabz.csv;

import java.io.*;

public class LargeCSVChunkReader {

    public static void main(String[] args) {
        String filePath = "largefile.csv";
        int batchSize = 100;
        int totalRecords = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineCount = 0;

            // Skip header if present
            String header = br.readLine();
            if (header != null) {
                System.out.println("Header: " + header);
            }

            while ((line = br.readLine()) != null) {
                lineCount++;
                totalRecords++;

                // Simulate processing the line
                // Example: System.out.println(line);

                if (lineCount == batchSize) {
                    System.out.println("Processed: " + totalRecords + " records so far...");
                    lineCount = 0; // reset for next chunk
                }
            }

            // In case total is not a multiple of 100
            if (lineCount > 0) {
                System.out.println("Processed: " + totalRecords + " records in total.");
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
