class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        long total = 0;

        // Step 1: Total sum
        for (int[] row : grid) {
            for (int val : row) {
                total += val;
            }
        }

        // Step 2: If odd → impossible
        if (total % 2 != 0) return false;

        long target = total / 2;

        // Step 3: Horizontal cut
        long rowSum = 0;
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n; j++) {
                rowSum += grid[i][j];
            }
            if (rowSum == target) return true;
        }

        // Step 4: Vertical cut
        long[] colSum = new long[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                colSum[j] += grid[i][j];
            }
        }

        long curr = 0;
        for (int j = 0; j < n - 1; j++) {
            curr += colSum[j];
            if (curr == target) return true;
        }

        return false;
    }
}