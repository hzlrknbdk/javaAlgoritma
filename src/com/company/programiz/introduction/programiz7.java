package com.company.programiz.introduction;


import java.util.Scanner;

public class programiz7 {

    //Check whether an alphabet is vowel or consonant using switch statement
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen bir harf giriniz: " );
        String ch = scan.nextLine();
        System.out.println(ch);
        switch (ch) {
            case "a":
            case "e":
            case "ı":
            case "i":
            case "u":
            case "ü":
            case "o":
            case "ö":
                System.out.println(ch + " is wowel.");
                break;
            default:
                System.out.println(ch + " is consonant.");

        }
    }
}
