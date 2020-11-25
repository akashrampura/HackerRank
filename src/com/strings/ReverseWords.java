package com.strings;

public class ReverseWords {

    public static void per(String prefix, String word){
        int n = word.length();
        if(n==0){
            System.out.println(prefix);
        }else{
            for(int i=0; i<word.length();i++){
                System.out.println("Prefix: "+prefix+word.charAt(i)+" Word: "+word.substring(0,i)+word.substring(i+1,n));
                per(prefix+word.charAt(i),word.substring(0,i)+word.substring(i+1,n));
            }
        }
    }

    public static void main(String[] args) {

        String s = "JSP";
        per("",s);

    }
}
