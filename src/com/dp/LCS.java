package com.dp;

import java.util.LinkedList;

public class LCS {

    public void  lcs(char[] X, char[]  Y ){
        int m = X.length;
        int n = Y.length;
        int[][] L =  new int[m+1][n+1];
        String s = "";

        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0){
                    System.out.println(0);
                    L[i][j] = 0;
                }else if(X[i-1]==Y[j-1]){
                    L[i][j] = 1 + L[i-1][j-1] ;
                }else{
                    L[i][j] = Math.max( L[i-1][j] ,L[i][j-1]);
                }
            }
        }
        System.out.println(L[m][n]);


    }


    public static void main(String[] args) {

        String s = "stra";


    }
}
