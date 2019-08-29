package com.company.programiz.introduction;

public class programiz12 {

    // Java Program to Check Alphabet using ternary operator

    public static void main(String[] args) {
        char ch = '*';

        String alphabet = (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ? ch + " is an alphabet." : ch + " is not an alphabet.";
        System.out.println(alphabet);
    }
}
