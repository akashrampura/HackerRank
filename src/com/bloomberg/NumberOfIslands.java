package com.bloomberg;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int islands = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] == '1'){
                    islands++;
                    gridDFS(grid,i,j);
                }
            }
        }
        return islands;
    }

    public int numIslands2(char[][] grid){
        int islands = 0;
        int nr = grid.length;
        int nc = grid[0].length;
        for(int r=0; r<nr; r++){
            for(int c=0; c<nc; c++){
                if(grid[r][c] == '1'){
                    islands++;
                    grid[r][c] = '0';
                    Queue<Integer> queue = new LinkedList<>();
                    queue.add(r * nc + c);
                    while(!queue.isEmpty()){
                        int id = queue.poll();
                        int row = id / nc;
                        int col = id % nc;
                        if(row-1 > 0 && grid[row-1][col] == '1'){
                            queue.add((row-1)*nc + col);
                            grid[row-1][col] = '0';
                        }
                        if(row + 1 <= nr && grid[row+1][col] == '1'){
                            queue.add((row+1) * nc + col);
                            grid[row+1][col] = '0';
                        }
                        if(col-1 >0 && grid[row][col-1] == '1'){
                            queue.add(row * nc + col - 1);
                            grid[row][col-1] = '0';
                        }
                        if(col+1 <= nc && grid[row][col+1] == '1'){
                            queue.add(row * nc + col + 1);
                            grid[row][col+1] = '0';
                        }
                    }

                }
            }
        }
        return islands;

    }

    private void gridDFS(char[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j< 0 || j>=grid[i].length || grid[i][j] == '0') return;

        grid[i][j] = '0';
        gridDFS(grid, i-1,j);
        gridDFS(grid, i+1,j);
        gridDFS(grid, i,j-1);
        gridDFS(grid, i,j+1);

    }

}
