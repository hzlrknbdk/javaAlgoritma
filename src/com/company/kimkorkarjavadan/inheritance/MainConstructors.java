package com.company.kimkorkarjavadan.inheritance;

public class MainConstructors {
    public static void main(String[] args) {

        Employee employee = new Employee("Hazal ", " Bilgisayar Mühendisliği", 6000);
        Manager manager = new Manager(" Şebnem", " Öğrenci", 0);
        manager.showInfo();
        employee.showInfo();
    }
}
