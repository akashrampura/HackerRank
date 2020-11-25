package com.gfg;

import java.io.IOException;
import java.util.PriorityQueue;

public class Prime {

    public Prime() throws Exception{

        throw new IOException();
    }

    public static void isPrime(int n){

        if(n <= 1){
            System.out.println(false);
        }
        for(int i=2;i<n; i++){
            if(n % i == 0){
                System.out.println(false);
            }
        }
    }

    public static void generatePrime(int n){
        boolean[] prime = new boolean[n+1];
        for(int i=0; i<n ;i++){
            prime[i] = true;
        }
        for(int p = 2; p*p <=n; p++){

            if(prime[p]==true){
                // update multiples of p
                for(int i = p*p ; i<=n ; i += p){
                    prime[i] = false;
                }

            }
        }

        for(int i = 2; i <= n; i++){
            if(prime[i]){
                System.out.println(i);
            }
        }
    }



    public static void main(String[] args) {
        int n = 11;
        generatePrime(11);

    }
}
