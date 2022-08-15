package com.tahera;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] runningSum = new int[nums.length];

        int a = nums[0];
        runningSum[0] = a;
        for(int i = 0; i< nums.length - 1;i++){
            a = a + nums[i + 1];
            runningSum[i + 1] = a;
        }
        System.out.println(Arrays.toString(runningSum));
    }
}
