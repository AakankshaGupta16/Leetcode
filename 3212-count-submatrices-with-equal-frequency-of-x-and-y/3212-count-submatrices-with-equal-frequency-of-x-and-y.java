class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] prefix = new int[n][m];   // stores sum (+1, -1, 0)
        int[][] prefixX = new int[n][m];  // stores count of 'X'

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                // Convert current cell
                int val = 0;
                if (grid[i][j] == 'X') val = 1;
                else if (grid[i][j] == 'Y') val = -1;

                // Build prefix sum
                prefix[i][j] = val;
                prefixX[i][j] = (grid[i][j] == 'X') ? 1 : 0;

                if (i > 0) {
                    prefix[i][j] += prefix[i - 1][j];
                    prefixX[i][j] += prefixX[i - 1][j];
                }
                if (j > 0) {
                    prefix[i][j] += prefix[i][j - 1];
                    prefixX[i][j] += prefixX[i][j - 1];
                }
                if (i > 0 && j > 0) {
                    prefix[i][j] -= prefix[i - 1][j - 1];
                    prefixX[i][j] -= prefixX[i - 1][j - 1];
                }

                // Check conditions
                if (prefix[i][j] == 0 && prefixX[i][j] > 0) {
                    count++;
                }
            }
        }

        return count;
    }
}