package com.tahera;

public class EvenNumDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
        //System.out.println(digits2(289765));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    //function to check whether a number contains even no of digits
    static boolean even(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }
    static  int digits(int num){
        if(num<0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }

    /*static  int digits(int num){
        //if number is negative,make it positive
        if(num<0){
            num = num * -1;
        }
        //without this,it won't count 0 as a digit
        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
     */


}
