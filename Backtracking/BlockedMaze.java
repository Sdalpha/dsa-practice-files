package Backtracking;

public class BlockedMaze {

    public static void maze(int[][] grid, int row, int col, String ans, boolean[][] visited){

        if(row == grid.length - 1 && col == grid[0].length - 1){
            System.out.println(ans);
            return;
        }

        if(row >= grid.length || col >= grid[0].length || row < 0 || col < 0 || grid[row][col]==1 || visited[row][col]){
            return;
        }

        visited[row][col] = true;

        maze(grid, row-1, col, ans + "T", visited);
        maze(grid, row+1, col, ans + "D", visited);
        maze(grid, row, col-1, ans + "L", visited);
        maze(grid, row, col+1, ans + "R", visited);

        visited[row][col] = false;
    }


    public static void main(String[] args) {
        int[][] grid = {{0,1,0,0},{0,0,0,0},{0,1,0,0},{0,1,1,0}};
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        maze(grid,0,0,"",visited);
    }
}
