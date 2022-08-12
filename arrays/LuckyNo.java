package com.tahera;

import java.util.ArrayList;

//leetcode question no 1380
public class LuckyNo {
    public static void main(String[] args) {
        int matrix[][] = {{7,3,8},
                         {9,11,13},
                         {15,14,17}};
        ArrayList<Integer> ans = new ArrayList<>();


        for(int i = 0; i< matrix.length; i++){
            int col = 0;
            int min = matrix[i][0];

            for(int j = 0; j<matrix[i].length; j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                    col = j;
                }
            }
            int max = matrix[i][col];
            for(int k = 0; k< matrix.length;k++){
                if(matrix[k][col] > max){
                    max = matrix[k][col];
                }
            }

            if(min == max){
              ans.add(max);
            }

        }
        System.out.println(ans);

    }
}
