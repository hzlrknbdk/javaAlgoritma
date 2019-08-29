package com.company.youtubeAlgoritma;

public class soru17 {

    //Tersten yazıldığında da aynı değeri olan sayılara Palindrom sayılar denir.
    // Örnek olarak "1991" veya "34543" sayıları tersten yazılsa bile aynı değerde olurlar.
    // 1000 - 100000 sayıları arasındaki palindromları bulan programı yazınız?

    public static void main(String[] args) {
        String duz, ters;
        int i, j;
        for (i = 1000; i < 100000; i++) {
            duz = Integer.toString(i);
            ters = "";
            for (j = duz.length() - 1; j >= 0; j--) {
                ters += duz.charAt(j);
            }
            if (duz.equals(ters)) System.out.println(i + " - ");
        }
    }
}