package com.tahera;

import java.util.ArrayList;

public class ExtraCandies {
    public static void main(String[] args) {
        int[] candies = {2,8,7};
        int extraCandies = 1;
        ArrayList <Boolean> result = new ArrayList<>(candies.length);
        int max = 0;

        for(int i = 0; i< candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        for(int i = 0;i<candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        System.out.println(result);
    }
}
