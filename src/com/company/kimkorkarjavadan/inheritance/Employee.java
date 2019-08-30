package com.company.kimkorkarjavadan.inheritance;

public class Employee {

    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {

        this.name = name;
        this.department = department;
        this.salary = salary;

    }

    public void showInfo() {

        System.out.println("Bilgiler....");
        System.out.println("İsmi: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println();


    }
}
