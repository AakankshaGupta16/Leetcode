class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int MOD = 12345;

        int total = n * m;
        int[] arr = new int[total];

        // Step 1: Flatten grid → arr
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[idx++] = grid[i][j] % MOD;
            }
        }

        // Step 2: Prefix pass (store in result array)
        int[] result = new int[total];
        result[0] = 1;

        for (int i = 1; i < total; i++) {
            result[i] = (result[i - 1] * arr[i - 1]) % MOD;
        }

        // Step 3: Suffix pass (multiply on the fly)
        int suffix = 1;
        for (int i = total - 1; i >= 0; i--) {
            result[i] = (result[i] * suffix) % MOD;
            suffix = (suffix * arr[i]) % MOD;
        }

        // Step 4: Convert back to 2D
        int[][] ans = new int[n][m];
        idx = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[i][j] = result[idx++];
            }
        }

        return ans;
    }
}