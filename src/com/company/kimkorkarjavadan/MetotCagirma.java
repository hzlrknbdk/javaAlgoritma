package com.company.kimkorkarjavadan;

public class MetotCagirma {
    public static void main(String[] args) {

        System.out.println("Fark= " + farkiniAl(9, 6));

    }

    public static int farkiniAl(int x, int y) {
        int farki;
        if (x > y) {

            farki = x - y;

        } else {
            farki = y - x;
        }
        return farki;
    }

}
