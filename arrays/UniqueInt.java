package com.tahera;

import java.util.Arrays;

public class UniqueInt {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = i * 2 - n + 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
