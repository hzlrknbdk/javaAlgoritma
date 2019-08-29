package com.company.youtubeAlgoritma;

import java.util.Scanner;

public class soru5 {

    //Vize notunun %40'ını, Final notunun %60'ını alarak ortalama notu hesaplayan
    // ,ortalama 50 den büyükse "Geçti", küçükse "Kaldı" yazan programı yazınız?

    public static void main(String[] args) {
        int vize_not, final_not;
        float ortalama;
        Scanner scan = new Scanner(System.in);
        System.out.println("Vize notu= ");
        vize_not = scan.nextInt();
        System.out.println("Final notu= ");
        final_not = scan.nextInt();

        ortalama = (float) ((float) vize_not * 0.4 + (float) final_not * 0.6);
        if (ortalama > 50) System.out.println("Geçti");
        else System.out.println("Kaldı");


    }
}
