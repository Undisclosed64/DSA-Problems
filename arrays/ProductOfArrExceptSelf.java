package com.tahera;

import java.util.Arrays;

public class ProductOfArrExceptSelf {
    public static void main(String[] args) {

        //prefix/suffix approach
        int[] nums = {1,2,3,4};
        int n = nums.length;
        int[] ans = new int[n];
        int curr = 1;
        for(int i = 0; i<n;i++){
            ans[i] = curr;
            curr *= nums[i];
        }
        curr = 1;
        for(int i = n - 1; i >= 0; i--){
           ans[i] *= curr;
           curr *= nums[i];
        }

        System.out.println(Arrays.toString(ans));
    }
}
