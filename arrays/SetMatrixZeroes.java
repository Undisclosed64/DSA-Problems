package com.tahera;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},
                {1,0,1},
                {1,1,1}};
        int m = matrix.length;
        int n = matrix[0].length;
        boolean isZeroCol = false;
        boolean isZeroRow = false;

        for(int i = 0; i<m; i++) { //check the first column
            if (matrix[i][0] == 0) {
                isZeroCol = true;
            }
        }
        for (int i = 0; i < n; i++) { //check the first row
            if (matrix[0][i] == 0) {
                isZeroRow = true;
            }
        }
        for(int i = 1; i < m; i++) { //check except the first row and column
            for (int j = 1; j < n; j++)
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
        }
        for(int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
        }
        if (isZeroCol) { //handle the first column
            for (int i = 0; i < m; i++)
                matrix[i][0] = 0;
        }
        if (isZeroRow) { //handle the first row
            for (int i = 0; i < n; i++)
                matrix[0][i] = 0;
        }
        for(int i = 0; i< matrix.length;i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

}
/* Brute force approach
 ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> cols = new ArrayList<>();

        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                 row.add(i);
                 cols.add(j);
                }
            }
        }
        for(int i = 0; i<row.size();i++){
            for(int j = 0; j<matrix[0].length;j++){
                matrix[row.get(i)][j] = 0;
            }
        }
        for(int i = 0; i<cols.size();i++){
            for(int j = 0; j< matrix.length;j++){
                matrix[j][cols.get(i)] = 0;
            }
        }

        for(int i = 0; i< matrix.length;i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
 */
