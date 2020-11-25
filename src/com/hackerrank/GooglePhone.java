package com.hackerrank;

public class GooglePhone {

    public static boolean isSmallGridPresent(int[][] bigGrid, int[][] smallGrid){


//
        int bigR = bigGrid.length, bigC = bigGrid[0].length, smallR = smallGrid.length, smallC = smallGrid[0].length;

        if(smallR > bigR || smallC > bigC) return false;

        for(int i = 0; i < bigR; i++){
            for(int j = 0; j < bigC; j++){
                if(bigGrid[i][j] == smallGrid[0][0]){
                    return dfs(smallGrid, bigGrid, i, j, 0, 0);
                }
            }
        }
        return false;
    }

    public static boolean dfs(int[][] smallGrid, int[][] bigGrid, int i, int j, int k, int l){
        System.out.println(i+" "+j+" "+k+" "+l);
        if(i >= bigGrid.length || i < 0 || j >= bigGrid[0].length || j < 0 || k >= smallGrid.length ||
        k < 0 || l >= smallGrid[0].length || l < 0 || bigGrid[i][j] != smallGrid[k][l]){
            return false;
        }
        int temp = bigGrid[i][j];
        bigGrid[i][j] = Integer.MIN_VALUE;
        boolean found = dfs(smallGrid, bigGrid, i + 1, j,  k + 1, l) ||
                dfs(smallGrid, bigGrid, i - 1, j, k - 1, l) ||
                dfs(smallGrid, bigGrid, i, j - 1, k, l - 1) ||
                dfs(smallGrid, bigGrid, i, j + 1, k, l + 1);
        bigGrid[i][j] = temp;
        return found;


    }

    public static void main(String[] args) {
        int[][] big = {{1,2,3,4}, {1,2,3,4}, {1,2,3,4}, {1,2,3,4}};
        int[][] small = {{1,2}, {1,2}};
        System.out.println(isSmallGridPresent(big, small));

    }

}
