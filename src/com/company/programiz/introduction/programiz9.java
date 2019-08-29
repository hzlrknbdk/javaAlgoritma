package com.company.programiz.introduction;

public class programiz9 {
    public static void main(String[] args) {
        double a = 10, b = 54, c = 26;
        double root1, root2;
        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Reel kök yok.");
        } else if (delta > 0) {
            root1 = (-b + Math.sqrt(delta)) / 2 * a;
            root2 = (-b - Math.sqrt(delta)) / 2 * a;
            System.out.println("Root1: " + root1);
            System.out.println("Root2: " + root2);
        } else if (delta == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.println("Root1=Root2= " +root1 + root2);
        }

    }
}
