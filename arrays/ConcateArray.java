package com.tahera;

import java.util.Arrays;

public class ConcateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int n = nums.length;
        System.out.println(n);
        int[] ans = new int[nums.length * 2];
        for(int i = 0; i<nums.length; i++){
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        System.out.println(Arrays.toString(ans));
    }
}
