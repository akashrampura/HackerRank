package com.arrays;

import java.util.Arrays;

public class MaxSumNoOverlap {

    public static int maxSumTwoNoOverlap(int[] A, int L, int M) {
        int len = A.length;
        int[] sum = new int[len];
        sum[0] = A[0];
        int res = 0;

        for (int i = 1; i < len; ++i) {
            sum[i] = sum[i - 1] + A[i];
        }

        int Lmax = sum[L - 1], Mmax = sum[M - 1];
        System.out.println(Arrays.toString(sum)+" Lmax: "+Lmax+" MMax: "+Mmax);
        for (int i = 0; i < len; ++i) {
            if (i >= L && i + M - 1 < len) {
                res = Math.max(res, Lmax + sum[i + M - 1] - sum[i - 1]);
            }

            if (i >= M && i + L - 1 < len) {
                res = Math.max(res, Mmax + sum[i + L - 1] - sum[i - 1]);
            }

            if (i >= L) {
                Lmax = Math.max(Lmax, sum[i] - sum[i - L]);
            }

            if (i >= M) {
                Mmax = Math.max(Mmax, sum[i] - sum[i - M]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] A = {0,6,5,2,2,5,1,9,4};
        int L = 1, M = 2;
        System.out.println(maxSumTwoNoOverlap(A,L,M));


    }
}
