package com.strings;

public class RepeatedString {

    static long repeatedString1(String s, long n) {
        long result = 0;
        long aLen = s.length(), stringLen = s.length();
        if (n < stringLen) {
            aLen = n;
            for (int i = 0; i < aLen; i++) {
                if (s.charAt(i) == 'a') {
                    result++;
                }
            }
            return result;
        } else {
            for (int i = 0; i < aLen; i++) {
                if (s.charAt(i) == 'a') {
                    result++;
                }
            }
        }

        long k = n / stringLen;
        System.out.println(k);


        if (n % stringLen == 0) {
            result = result * k;
            return result;
        } else if (n < 2 * stringLen) {
            aLen = n - stringLen;
            for (int i = 0; i < aLen; i++) {
                if (s.charAt(i) == 'a') {
                    result++;
                }
            }
        } else {
            result = result * k;
            aLen = n - (k * stringLen);
            for (int i = 0; i < aLen; i++) {
                if (s.charAt(i) == 'a') {
                    result++;
                }
            }
        }
        return result;
    }

    static long repeatedString(String s, long n) {
        long len = s.length();
        long rem = n % len;
        long sumAll = 0;
        long sumRem = 0;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'a') {
                if (i < rem) {
                    sumRem++;
                }
                sumAll++;
            }
        }
        return ((n / len) * sumAll) + (sumRem);
    }

    public static void main(String[] args) {
//        long as = 5L/2L;
//        System.out.println(as);
        System.out.println(repeatedString("ojowrdcpavatfacuunxycyrmpbkvaxyrsgquwehhurnicgicmrpmgegftjszgvsgqavcrvdtsxlkxjpqtlnkjuyraknwxmnthfpt", 685118368975L));

    }
}
