package com.tahera;

import java.util.Arrays;

public class SumTwo {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans = new int[2];

        for(int i = 0; i< nums.length;i++){
            for(int j = i; j<nums.length;j++){
                if(i!=j && nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        System.out.println(Arrays.toString(ans));

    }
}
