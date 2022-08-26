package com.tahera;

import java.util.Arrays;

public class MaximumPopulationYear {
    public static void main(String[] args) {
        int[][] logs = {{2033,2034},{2039,2047},{1998,2042},{2047,2048},{2025,2029},{2005,2044},{1990,1992},{1952,1956},{1984,2014}};
        int[] years = new int[101];
        int max = 0;
        int year = 0;
        for(int i = 0; i < logs.length; i++) {
            int start = logs[i][0] - 1950;
            int end = logs[i][1] - 1950 - 1;
            for(int k = start;k<=end;k++){
                years[k]+=1;
            }
            }
        for(int j = 0; j<years.length;j++){
            if(years[j]>max){
                max = years[j];
                year = 1950 + j;
            }
        }
        System.out.println(year);
    }
}
