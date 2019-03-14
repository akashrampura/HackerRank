package com.strings;

public class RemoveAdjescentDuplicates {

    static void remove(String str1){

        StringBuilder sb = new StringBuilder(str1);

        for(int i=1;i<str1.length();i++){
            if(str1.charAt(i)== str1.charAt(i-1)){
               String s = String.valueOf(str1.charAt(i))+String.valueOf(str1.charAt(i-1));
                System.out.println(s);
                String new_str = str1.replace(s,"");
                str1 = new_str;
                System.out.println(new_str);
            }
        }
    }

    public static void main(String[] args) {
        String str1 = "amazonamazon";
        remove(str1);


    }
}
