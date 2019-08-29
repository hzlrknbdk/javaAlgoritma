package com.company.programiz.introduction;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class programiz16 {
    public static void main(String[] args) {
        double num = 3.1456325;
        DecimalFormat decimalFormat = new DecimalFormat("#.####");
        decimalFormat.setRoundingMode(RoundingMode.CEILING);
        System.out.println("Decimal Format: " + (decimalFormat.format(num)));

        System.out.format("%.5f", num);


    }
}
