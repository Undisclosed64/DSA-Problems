package com.tahera;

import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3}, {3,2,2}};
        int[] sums = new int[accounts.length];
        for(int i = 0; i< accounts.length;i++){
            int sum = 0;
            for(int j = 0; j<accounts[i].length; j++){
                sum = sum + accounts[i][j];
            }
            sums[i] = sum;
        }
        int max = sums[0];
        for(int i = 0; i< sums.length;i++){
            if(sums[i] > max){
              max = sums[i];
            }
        }
        System.out.println(max);
    }
}
