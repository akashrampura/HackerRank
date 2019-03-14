package com.arrays;

public class MissingNum {



    public static void main(String[] args) {
        int a[] = {1,3,4,5,6,8};

        int tot = (a.length+2)*(a.length+3)/2;
        System.out.println(tot);
        for(int i=0;i<a.length;i++){
            tot -= a[i];
        }
        System.out.println(tot);

    }
}
