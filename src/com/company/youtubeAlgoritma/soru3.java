package com.company.youtubeAlgoritma;

import java.util.Scanner;

public class soru3 {

    // Kullanıcıdan alınan 3 sayının en büyüğünü bulan programı yazınız?

    public static void main(String[] args) {

        int a, b, c;

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 1. sayıyı giriniz: ");
        a = scan.nextInt();

        System.out.println("Lütfen 2. sayıyı giriniz: ");
        b = scan.nextInt();

        System.out.println("Lütfen 3. sayıyı giriniz: ");
        c = scan.nextInt();

        if (a > b && a > c)
            System.out.println("En büyük sayı: " + a);
        else if (b > a && b > c)
            System.out.println("En büyük sayı: " + b);
        else if (c > a && c > b)
            System.out.println("En büyük sayı: " + c);

    }
}
