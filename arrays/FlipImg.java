package com.tahera;

import java.util.Arrays;

public class FlipImg {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int n = image.length;
        int[][] result = new int[n][n];

        for(int i = 0; i<image.length;i++){
            int start = 0;
            for(int j = image[i].length - 1; j>=0; j--){
                result[i][start] = image[i][j];
                start++;
            }
           for(int k = 0; k<result.length;k++){
               if(result[i][k] == 0){
                   result[i][k] = 1;
             } else {
                    result[i][k] = 0;
                }
            }
            System.out.println(Arrays.toString(result[i]));
        }
    }
}

//a better solution of 0 ms
/*class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                image[i][j] = invertTheValue(image[i][j]);
            }
        }

        for (int i = 0; i < image.length; i++) {
            reverseArray(image[i]);
        }

        return image;
    }

    public static int invertTheValue(int value) {
        return value == 0 ? 1 : 0;
    }

    public static void reverseArray(int[] imgArray) {
        int start = 0;
        int end = imgArray.length - 1;
        int temp = 0;

        while (start < end) {
            temp = imgArray[start];
            imgArray[start] = imgArray[end];
            imgArray[end] = temp;
            start++;
            end--;
        }
    }
}*/