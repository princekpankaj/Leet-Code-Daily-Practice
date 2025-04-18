class Solution {

    public int helper(int row, int col, int a, int b, int[][] memo) {
        if (row == a-1 && col == b-1) return 1;
        
        if (row >= a || col >= b) return 0;

        if (memo[row][col] != -1) return memo[row][col];

        int down = helper(row + 1, col, a, b, memo);
        int right = helper(row, col + 1, a, b, memo);

        memo[row][col] = down + right;
        return memo[row][col];
    }

    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                memo[i][j] = -1;
            }
        }
        return helper(0, 0, m, n, memo);
    }
}
