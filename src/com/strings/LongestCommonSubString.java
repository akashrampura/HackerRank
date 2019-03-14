package com.strings;

public class LongestCommonSubString {

    public static void main(String[] args) {
        String s1 = "GeeksForGeeks";
        String s2 = "GeeksForQuiz";
        int max = 0;
        int count = 0;
        String result = "";
        for(int i=0;i<s2.length();i++){
            for(int j=i+1;j<=s2.length();j++){
                count++;
                String c = s2.substring(i,j);
                if(c.length()>max && s1.contains(c)){
                    max = c.length();
                     result = c;
                }

            }

        }
        System.out.println(count);
        System.out.println(result);

    }
}
