/**
 * You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally
 * (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.
 *
 * The area of an island is the number of cells with a value 1 in the island.
 *
 * Return the maximum area of an island in grid. If there is no island, return 0.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],
 *                [0,0,0,0,0,0,0,1,1,1,0,0,0],
 *                [0,1,1,0,1,0,0,0,0,0,0,0,0],
 *                [0,1,0,0,1,1,0,0,1,0,1,0,0],
 *                [0,1,0,0,1,1,0,0,1,1,1,0,0],
 *                [0,0,0,0,0,0,0,0,0,0,1,0,0],
 *                [0,0,0,0,0,0,0,1,1,1,0,0,0],
 *                [0,0,0,0,0,0,0,1,1,0,0,0,0]]
 * Output: 6
 * Explanation: The answer is not 11, because the island must be connected 4-directionally.*/


public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int maximumArea =0;
        for(int i=0; i<grid.length; i++)
            for(int j=0; j<grid[0].length; j++)
                if(grid[i][j] == 1)
                    maximumArea = Math.max(maximumArea , areaOfIsland(grid , i, j));

        return maximumArea;

    }

    private int areaOfIsland(int[][] grid, int i, int j){
        if( j>=grid[0].length ||i>=grid.length || j<0 ||i<0 || grid[i][j] == 0  )
            return 0;

        grid[i][j] = 0;

        return 1+ areaOfIsland(grid, i+1, j) + areaOfIsland(grid, i, j+1) + areaOfIsland(grid, i-1, j)
                + areaOfIsland(grid, i, j-1);
    }

}
