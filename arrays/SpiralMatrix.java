package com.tahera;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                {4,5,6},
                {7,8,9}};
          ArrayList<Integer> result = new ArrayList<>();

            if(matrix == null || matrix.length == 0) System.out.println(result);
            int top = 0;
            int bottom = matrix.length-1;
            int left = 0;
            int right = matrix[0].length-1;
            int count = 0;

            while(top<=bottom && left<=right){
             switch(count) {
                 case 0:
                     //go from left to right
                     for (int i = left; i <= right; i++) {
                         result.add(matrix[top][i]);
                     }
                     top++;
                 case 1:
                     //go from top to bottom when hit right
                     for (int i = top; i <= bottom; i++) {
                         // System.out.println(matrix[i][right]);
                         result.add(matrix[i][right]);
                     }
                     right--;

                 case 2:
                     //go from bottom to left
                     for (int i = right; i >= left; i--) {
                         // System.out.println(matrix[bottom][i]);
                         result.add(matrix[bottom][i]);
                     }
                     bottom--;

                 case 3:
                     //go from bottom to up
                     for (int i = bottom; i >= top; i--) {
                         // System.out.println(matrix[i][left]);
                         result.add(matrix[i][left]);
                     }
                     left++;
             }

                count = (count+1)%4;
                System.out.println(result);
            }

        }

    }