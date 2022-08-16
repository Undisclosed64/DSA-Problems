package com.tahera;

import java.util.ArrayList;
import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int j = 0;
        int[] ans = new int[nums.length];

        for(int i = 0; i< n; i++) {
            ans[j] = nums[i];
            ans[j + 1] = nums[i + n];
            j+=2;
        }
        System.out.println(Arrays.toString(ans));
    }
}

