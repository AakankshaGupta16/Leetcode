import java.util.*;

class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int[][] ans = new int[m - k + 1][n - k + 1];

        for (int i = 0; i <= m - k; i++) {

            // Build first window for this row
            TreeMap<Integer, Integer> map = new TreeMap<>();

            for (int x = i; x < i + k; x++) {
                for (int y = 0; y < k; y++) {
                    map.put(grid[x][y], map.getOrDefault(grid[x][y], 0) + 1);
                }
            }

            ans[i][0] = getMinDiff(map);

            // Slide column-wise
            for (int j = 1; j <= n - k; j++) {

                // Remove left column
                for (int x = i; x < i + k; x++) {
                    int val = grid[x][j - 1];
                    map.put(val, map.get(val) - 1);
                    if (map.get(val) == 0) map.remove(val);
                }

                // Add right column
                for (int x = i; x < i + k; x++) {
                    int val = grid[x][j + k - 1];
                    map.put(val, map.getOrDefault(val, 0) + 1);
                }

                ans[i][j] = getMinDiff(map);
            }
        }

        return ans;
    }

    // Compute minimum absolute difference from sorted keys
    private int getMinDiff(TreeMap<Integer, Integer> map) {
        int prev = Integer.MIN_VALUE;
        int minDiff = Integer.MAX_VALUE;

        for (int key : map.keySet()) {
            if (prev != Integer.MIN_VALUE) {
                minDiff = Math.min(minDiff, key - prev);
            }
            prev = key;
        }

        return minDiff == Integer.MAX_VALUE ? 0 : minDiff;
    }
}