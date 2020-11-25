package com.amazon;

import java.util.*;

public class TwoSumMatrix {

    static int[][] searchMatrixModified(int[][] matrix, int target){
        if(matrix.length == 0 || matrix[0].length == 0) return matrix;
        int row = matrix.length - 1, col = matrix[0].length - 1;
        while(row > 0 && target <= matrix[row][0]){
            row--;
        }
        while(col > 0 && target <= matrix[0][col]){
            col--;
        }
        Set<Integer> set = new HashSet<>();
        List<int[]> result = new ArrayList<>();
        for(int i = 0; i <= row; i++){
            for(int j = 0; j <= col; j++){
                if(set.contains(target - matrix[i][j])){
                    int[] ar = new int[2];
                    ar[0] = matrix[i][j];
                    ar[1] = target - matrix[i][j];
                    result.add(ar);
                }
                set.add(matrix[i][j]);
            }
        }
        System.out.println(Arrays.deepToString(result.toArray(new int[result.size()][])));
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] arr = {{1,   4,  7, 11, 15},{2,   5,  8, 12, 19},{3,   6,  9, 16, 22},{10, 13, 14, 17, 24},{18, 21, 23, 26, 30}};
        searchMatrixModified(arr, 9);
    }
}
