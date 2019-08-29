package com.company.programiz.introduction;

public class programiz14 {

    // Find Frequency of Character

    public static void main(String[] args) {

        String str = "Hazal Ruken Budak";
        char ch = 'k';
        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                ++frequency;
            }
        }
        System.out.println("Frequency: " + frequency);
    }
}
