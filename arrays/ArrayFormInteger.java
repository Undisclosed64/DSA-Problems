package com.tahera;


import java.math.BigInteger;
import java.util.ArrayList;


//leetcode problem no 989
public class ArrayFormInteger {
    public static void main(String[] args) {
        int[] nums = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        StringBuilder builder = new StringBuilder();
        ArrayList<Integer> ans = new ArrayList<>(10);

        for (int i = 0; i < nums.length; i++) {
            builder.append(nums[i]);
        }

        String a = builder.toString();
        BigInteger convertedStr = new BigInteger(a);
        BigInteger bi = BigInteger.valueOf(k);
        BigInteger sum =  convertedStr.add(bi);
        String temp = String.valueOf(sum);


        for (int i = 0; i < temp.length(); i++) {
            ans.add(temp.charAt(i) - '0');
        }

        System.out.println(ans);
    }
}


