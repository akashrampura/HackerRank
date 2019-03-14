package com.hackerrank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Stack;

public class Enfusion {

    static void dates(List<String> list){

        List<String> result = new ArrayList<>();
        for (String date:list)
              {
                  StringBuilder sb = new StringBuilder();
                  String[] sArr = date.split(" ");
                  for (int i=sArr.length-1;i>=0;i--) {
                      sb.append(sArr[i]);
                      System.out.println(sArr[i].substring(1,2));
                      if(i!=0){
                          sb.append("-");
                      }

                  }
                  result.add(sb.toString());

        }
        System.out.println(result);


    }

    static void stack(String[] op){

        Stack<String> stack = new Stack<>();



        for (String s: op) {
            if(s.contains("push")){
                String k = s.replace("push","");
                stack.push(k);
                //System.out.println(k.strip());
            }
            else if(s.contains("pop")){
                stack.pop();
            }
            else if(s.contains("inc")){
                s  = s.replace("inc","");
               String[] sArr =  s.split(" ");
                Integer k = Integer.parseInt(sArr[1].strip());
                Integer j = Integer.parseInt(sArr[2].strip());
                for (int i = 0; i < k; i++) {
                    Integer m = Integer.parseInt(stack.get(i).strip())+j;
                    stack.remove(i);
                    stack.add(i,m.toString());
                }
                //System.out.println(stack.peek().strip());
            }
            if(stack.isEmpty()){
                System.out.println("Empty");
            }
            else{
                System.out.println(stack.peek().strip());
            }

            //System.out.println(stack);
        }
    }



    public static void main(String[] args) throws ParseException {
        List<String> list = new ArrayList<>();
        list.add("20th Oct 2018");
        String[] sArr = {"push 4","pop","push 3","push 5","push 2","inc 3 1","pop","push 1","inc 2 2","push 4","pop","pop"};
        stack(sArr);

    }
}
