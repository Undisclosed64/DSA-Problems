package com.tahera;


import java.util.ArrayList;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans.add(i);
                    ans.add(j);
                }
            }
        }
        System.out.println(ans);

        }
}