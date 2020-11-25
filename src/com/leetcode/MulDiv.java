package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.BlockingQueue;

public class MulDiv {

    public  static int getSteps(int input){
        int steps = 0;
        Stack<Integer> stack = new Stack<>();
        stack.add(1);


        while (!stack.isEmpty()){
            Integer temp = stack.pop();
            Integer mul = temp * 2;
            Integer div = temp / 3;
            steps++;
            if(mul < input || div < input){
                stack.add(mul);
            }else{
                stack.add(div);
            }
            if(mul == input || div == input){
                break;
            }
        }
        return steps;
    }

    public static int getSteps(int n, int result, int steps) {
        if( result == n){
            return steps;
        }
        if(result == 0){
            result = 1;
        }
        int d = result / 3;
        if( result < n || d < n){
            result *= 2;
            steps++;
            steps = getSteps(n,result,steps);
        }
        else{
            result = d;
            steps++;
            steps = getSteps(n,result,steps);
        }
        return steps;


    }
    public static void main(String[] args) {
        Integer n = 1;
        Integer steps = 0;
//        getSteps(3, 2, 3, res, steps);
        //System.out.println(getSteps(n,0, steps));
        //System.out.println(res);
        System.out.println(getSteps(1));
    }


}
