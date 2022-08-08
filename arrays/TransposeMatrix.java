package com.tahera;

//leetcode problem no 867

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        int[][] answer = new int[matrix[0].length][matrix.length];

        for(int count = 0; count< matrix[0].length;count++){

        for(int i = 0; i<matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (count == j) {
                    System.out.println(matrix[i][j]);
                  answer[j][i] = matrix[i][j];
                }
            }
        }

        }
        System.out.println(answer);
    }
}
