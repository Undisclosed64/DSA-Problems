package com.tahera;

import java.util.Arrays;

public class SpiralMatrixII {
    public static void main(String[] args) {
        int n = 1;
        int[][] arr = new int[n][n];
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int count = 1;
        int b = 0;

        if(n == 1){
            arr[0][0] = 1;
            for(int i = 0; i< arr.length;i++){
                System.out.println(Arrays.toString(arr[i]));
            }
        }

        while(top<=bottom && left<=right) {
            switch (b) {
                //go from left to right
                case 0 -> {
                    for (int i = left; i <= right; i++) {
                        arr[top][i] = count;
                        count++;
                    }
                    top++;
                }

                //go from top to bottom
                case 1 -> {
                    for (int i = top; i <= bottom; i++) {
                        arr[i][right] = count;
                        count++;
                    }
                    right--;
                }

                //go from right to left
                case 2 -> {
                    for (int i = right; i >= left; i--) {
                        arr[bottom][i] = count;
                        count++;
                    }
                    bottom--;
                }
                //go from bottom to top
                case 3 -> {
                    for (int i = bottom; i >= top; i--) {
                        arr[i][left] = count;
                        count++;
                    }
                    left++;
                }
            }
            b = (b + 1) % 8;
        }

        for(int i = 0; i< arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
