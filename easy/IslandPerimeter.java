package xyz.viseator.leetcode.easy;

/**
 * Created by viseator on 2/9/17.
 * Wu Di
 * viseator@gmail.com
 */
public class IslandPerimeter {
    public static void main(String[] args) {

    }

    public static int islandPerimeter(int[][] grid) {
        int count = 0,s=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    s++;
                    if (i > 0 && grid[i - 1][j] == 1) count++;
                    if (j > 0 && grid[i][j - 1] == 1) count++;
                    if (i < grid.length-1 && grid[i + 1][j] == 1) count++;
                    if (j < grid[0].length-1 && grid[i][j + 1] == 1) count++;
                }
            }
        }
        return s*4-count;
    }

}

