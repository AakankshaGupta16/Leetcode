import java.util.*;

class Solution {
    public int[] getBiggestThree(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {

                // radius 0 (single cell)
                set.add(grid[r][c]);

                int maxRadius = Math.min(Math.min(r, m - 1 - r), Math.min(c, n - 1 - c));

                for (int k = 1; k <= maxRadius; k++) {

                    int sum = 0;

                    // top -> right
                    for (int i = 0; i < k; i++)
                        sum += grid[r - k + i][c + i];

                    // right -> bottom
                    for (int i = 0; i < k; i++)
                        sum += grid[r + i][c + k - i];

                    // bottom -> left
                    for (int i = 0; i < k; i++)
                        sum += grid[r + k - i][c - i];

                    // left -> top
                    for (int i = 0; i < k; i++)
                        sum += grid[r - i][c - k + i];

                    set.add(sum);
                }
            }
        }

        int size = Math.min(3, set.size());
        int[] ans = new int[size];

        int i = 0;
        for (int val : set) {
            if (i == size) break;
            ans[i++] = val;
        }

        return ans;
    }
}