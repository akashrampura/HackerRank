package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class GoldmanShacs {
	
	static int maxDifferenceOddEven(List<Integer> a) {

        int max = Integer.MIN_VALUE;
        int diff = -1;
        for(int i = 0; i< a.size(); i++){
            for(int j = 0; j<i; j++){
            	System.out.println(a.get(i)+" "+a.get(j));
                if(a.get(i)%2==0 && a.get(j)%2!=0 && a.get(i)>a.get(j)){
                diff = a.get(i) - a.get(j);
                }
                if(diff>max){
                    max = diff;
                }
            }

        }
        return diff;


    }
	public static void main(String[] args)  {
		List<Integer> a = new ArrayList<>();
		a.add(6);
		a.add(7);
		a.add(9);
		a.add(5);
		a.add(6);
		a.add(3);
		a.add(2);
		System.out.println(maxDifferenceOddEven(a));
	}

}
