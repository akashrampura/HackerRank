package com.hackerrank;

import java.util.Arrays;
import java.util.Map;

public class AmericanExpress {

    private static int findLongestSemiAlteringSubstring(String str) {
        int len = 0;
        if(str.length()==0){
            return 0;
        }else if(str.length()<3){
            return str.length();
        }else{
            for(int i=2,j=0;i<str.length();i++){
                if(str.charAt(i)== str.charAt(i-1) && str.charAt(i)==str.charAt(i-2)){
                    j = i-1;
                }
                len = Math.max(len,i-j+1);
            }
        }
        return len;
    }
    public static int maxSumTwoNoOverlap(int[] A, int L, int M) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            A[i] = sum;
        }
        System.out.println(Arrays.toString(A));
        int res = A[L + M - 1], Lmax = A[L - 1], Mmax = A[M - 1];
        System.out.println("Res: "+res+" Lmax: "+Lmax+" Mmax: "+Mmax);
        for (int i = L + M; i < A.length; ++i) {
            Lmax = Math.max(Lmax, A[i - M] - A[i - L - M]);
            Mmax = Math.max(Mmax, A[i - L] - A[i - L - M]);
            res = Math.max(res, Math.max(Lmax + A[i] - A[i - M], Mmax + A[i] - A[i - L]));

        }
        return res;
    }

    public static void main(String[] args) {
        //System.out.println(findLongestSemiAlteringSubstring("baaabbabbb"));
       int[] A = {0,6,5,2,2,5,1,9,4};
       int L = 1, M = 2;
       //System.out.println(maxSumTwoNoOverlap(A,L,M));
        int N = -670;
        String s = Integer.toString(N);
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length();i++){



        }
        System.out.println(sb);

    }
}
