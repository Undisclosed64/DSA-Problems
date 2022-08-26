package com.tahera;

import java.util.Arrays;

public class MatrixCellOddVal {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] matrix = new int[m][n];
        int[][] indices = {{0, 1}, {1, 1}};
        int odd = 0;
        for (int i = 0; i<indices.length; i++) {
            for (int j = 0; j < n; j++) {
                matrix[indices[i][0]][j] += 1;
            }
            for (int j2 = 0; j2 < m; j2++) {
                matrix[j2][indices[i][1]] += 1;
            }
        }

        for (int[] i : matrix)
        {
            for (int val : i)
            {
                if(val % 2 !=0){
                    odd++;
                }
            }
        }
              System.out.println(odd);
        }
    }

