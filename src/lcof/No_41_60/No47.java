package lcof.No_41_60;

public class No47 {
    public int maxValue(int[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;
        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < grid.length; i++)
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        for (int i = 1; i < grid[0].length; i++)
            dp[0][i] = dp[0][i - 1] + grid[0][i];

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[grid.length - 1][grid[0].length - 1];
    }

    public static void main(String[] args) {
        No47 n = new No47();
        int[][] grid = {{1, 2, 5}, {3, 2, 1}};
        System.out.println(n.maxValue(grid));
    }
}
