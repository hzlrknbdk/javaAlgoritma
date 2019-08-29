package com.company.youtubeAlgoritma;

import java.util.Random;
import java.util.Scanner;

public class soru16 {
    //Kullanıcın girdiği mXn boyutta bir matris oluşturup
    // bu matrisi rastgele sayılarla doldurunuz.
    // Bu matrisin transpozesini oluşturunuz?
    public static void main(String[] args) {
        int satir, sutun;
        Scanner scan = new Scanner(System.in);

        System.out.println("Satır sayısını giriniz:");
        satir = scan.nextInt();

        System.out.println("Sutun sayısını giriniz:");
        sutun = scan.nextInt();

        int[][] matris = new int[satir][sutun];
        Random r = new Random();

        int i, j;
        for (i = 0; i < satir; i++) {
            for (j = 0; j < sutun; j++) {
                matris[i][j] = r.nextInt(5);
                System.out.print(matris[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("\nTranspoze Matris");
        int[][] t = new int[sutun][satir];
        for (i = 0; i < sutun; i++) {
            for (j = 0; j < satir; j++) {
                t[i][j] = matris[j][i];
                System.out.print(t[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
