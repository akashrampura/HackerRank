package com.hackerrank;

public class WayFair {

    public static int solution(int n){
        int result = 0;
        String s = Integer.toString(n);
        char[] cArr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cArr.length; i++) {
            int a = Character.getNumericValue(cArr[i]);
            if(a<=5){
              sb.append(5);

            }
            sb.append(cArr[i]);
        }

        String s1 = String.valueOf(sb);
        result = Integer.parseInt(s1);
        return result;
    }


    public static void main(String[] args) {

        System.out.println(WayFair.solution(0));
    }
}
