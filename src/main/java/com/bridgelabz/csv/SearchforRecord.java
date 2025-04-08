package com.bridgelabz.csv;


import java.io.BufferedReader;
import java.io.FileReader;

public class SearchforRecord {
    public static void main(String[] args) {
        String name="Alice Green";
        try(BufferedReader br=new BufferedReader(new FileReader("employee.csv"))){
            String line;
            while((line=br.readLine())!=null){
                String[] colums=line.split(",");
                if(colums[1].equals(name)){
                    System.out.println("Department->"+colums[2]+", Salary->"+colums[3]);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}