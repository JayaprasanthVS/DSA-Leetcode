class Solution {
   public static boolean checkValidGrid(int[][] grid) {
		return knightConfig(grid, 0, 0, 0);
	}

	private static boolean knightConfig(int[][] grid, int val, int row, int col) {
		if (val == grid.length * grid.length) {
			return true;
		}

		if (row >= 0 && row < grid.length && col >= 0 && col < grid.length && grid[row][col] == val) {
			return (knightConfig(grid, val + 1, row - 2, col - 1) || knightConfig(grid, val + 1, row - 2, col + 1)
					|| knightConfig(grid, val + 1, row - 1, col - 2) || knightConfig(grid, val + 1, row + 1, col - 2)
					|| knightConfig(grid, val + 1, row - 1, col + 2) || knightConfig(grid, val + 1, row + 1, col + 2)
					|| knightConfig(grid, val + 1, row + 2, col - 1) || knightConfig(grid, val + 1, row + 2, col + 1));
		} else {
			return false;
		}
	}
}