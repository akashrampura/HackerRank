package com.stacks;

public class Stack {
     int max = 1000;
     int top;
     int[] arr = new int[max];
     Stack(){
         top = -1;
     }

     boolean isEmpty(){
         return top < 0;
     }

     boolean push(int num){
         if(top >= max -1){
             System.out.println("Stack Overflow");
             return false;
         }else{
             arr[++top] = num;
             return true;
         }
     }

     int pop(){
         if(top < 0){
             System.out.println("Stack underflow");
             return -1;
         }else{
             return arr[top--];
         }
     }
}
