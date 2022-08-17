package com.tahera;

import java.util.Arrays;

public class Pangram {
    public static void main(String[] args) {
        String sentence = "aquickbrownfoxjumpsoverthelazydog";
        if (sentence.length() < 26) {
            System.out.println(false);
        } else {
            String str = "abcdefghijklmnopqrstuvwxyz";
            Boolean ans = false;
            for (int i = 0; i < str.length(); i++) {
                if (sentence.indexOf(str.charAt(i)) == -1) {
                    System.out.println(false);
                }
            }
            System.out.println(true);
        }
    }
}
