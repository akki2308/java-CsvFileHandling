package com.bridgelabz.csv;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class Employees{
    public Employees(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    int id;
    String name;
    String department;
    int salary;
    public String toString() {
        return id + " | " + name + " | " + department + " | $" + salary;
    }
}

public class SortCSVFile {
    public static void main(String[] args) {
        List<Employees> employees=new ArrayList<>();
        try(BufferedReader br=new BufferedReader(new FileReader("employee.csv"))){
            br.readLine();
            String line;
            while((line=br.readLine())!=null){
                String[] array=line.split(",");
                int id=Integer.parseInt(array[0]);
                String name=array[1];
                String department=array[2];
                int salary=Integer.parseInt(array[3]);
                employees.add(new Employees(id,name,department,salary));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        employees.sort((e1,e2) -> Integer.compare(e2.salary,e1.salary));
        System.out.println("top 5 highest-paid employees");
        for(int i=0;i<Math.min(5, employees.size());i++){
            System.out.println(employees.get(i));
        }
    }
}