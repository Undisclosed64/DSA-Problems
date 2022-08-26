package com.tahera;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        int[] altitude = new int[gain.length];
        int element = 0;
        for(int i = 0; i< gain.length;i++){
            element = element + gain[i];
            altitude[i] = element;
        }
        int max = 0;
        for(int i = 0; i< altitude.length;i++){
            if(altitude[i]>max){
                max = altitude[i];
            }
        }
        System.out.println(max);
    }
}
