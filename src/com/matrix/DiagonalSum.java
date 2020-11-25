package com.matrix;

public class DiagonalSum {

    public static void printDiagonalSums(int[][] arr){
        int primary = 0, secondary = 0;
        for(int i=0; i<arr.length;i++){
           primary += arr[i][i];
           secondary += arr[i][arr.length-i-1];
        }
        System.out.println("Primary sum: "+primary);
        System.out.println("Secondary sum: "+primary);
    }
    public static void main(String[] args) {
        int [][] a = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 } };

        printDiagonalSums(a);
    }
}
