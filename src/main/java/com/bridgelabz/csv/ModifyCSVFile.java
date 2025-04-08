package com.bridgelabz.csv;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ModifyCSVFile {
    public static void main(String[] args) {
        String input="employees.csv";
        String output="updated_employee.csv";
        try(
                BufferedReader br=new BufferedReader(new FileReader(input));
                BufferedWriter bw=new BufferedWriter(new FileWriter(output))
        )
        {
            String header=br.readLine();
            bw.write(header);
            bw.newLine();
            String line;
            while((line=br.readLine())!=null){
                String[] colums=line.split(",");
                String department=colums[2];
                double salary = Double.parseDouble(colums[3]);
                if(department.equalsIgnoreCase("it")){
                    salary*=1.10;
                    colums[3]= String.format("%.2f",salary);
                }
                bw.write(String.join(",",colums));
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}