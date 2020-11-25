package com.bloomberg;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        result.add(list);
        for(int i=1; i<numRows; i++){
            List<Integer> previous = result.get(i-1);
            List<Integer> current = new ArrayList<>();
            current.add(1);
            for(int j=1; j<i; j++){
                current.add(previous.get(j)+previous.get(j-1));
            }
            current.add(1);
            result.add(current);

        }


        return result;



    }

}
