package com.tahera;

import java.util.Arrays;

public class SmallerThanCurrent {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] result = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                if(j!=i && nums[j] < nums[i]){
                   result[i]++;
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }

}
