package com.company.programiz.introduction;

import java.util.Scanner;

public class programiz6 {

    //   Check whether a number is even or odd using ternary operator
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();

        String evenOdd = (number % 2 == 0) ? "even" : "odd";
        System.out.println(number + " is " + evenOdd);

    }
}
