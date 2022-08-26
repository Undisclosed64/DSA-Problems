package com.tahera;

import java.util.Arrays;

public class TransposeMat {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        int[][] res = new int[matrix[0].length][matrix.length];
        for(int i = 0; i<matrix[0].length;i++){
            for(int j = 0; j<matrix.length;j++){
                res[i][j] = matrix[j][i];
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
