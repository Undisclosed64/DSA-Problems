package com.tahera;

public class EvenNumDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            String n = Integer.toString(nums[i]);
            if(n.length() % 2 == 0){
                count++;
            }
        }
            System.out.println(count);
    }
}
