package MY_DSA.Leet;

public class Leet463 {
    int surveyland(int[][] grid, int row, int col) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) {
            return 1;
        }
        if (grid[row][col] == 0) {
            return 1;
        }
        if (grid[row][col] == -1) {
            return 0;
        }
        grid[row][col] = -1;

        return surveyland(grid, row - 1, col)
                + surveyland(grid, row + 1, col)
                + surveyland(grid, row, col - 1)
                + surveyland(grid, row, col + 1);
    }

    public int islandPerimeter(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return surveyland(grid, i, j);
                }
            }
        }
        return 0;
    }
}
