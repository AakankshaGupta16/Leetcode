import java.util.*;

class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> list = new ArrayList<>();
        
        // Step 1: Flatten
        for (int[] row : grid) {
            for (int val : row) {
                list.add(val);
            }
        }
        
        // Step 2: Check feasibility (same remainder)
        int mod = list.get(0) % x;
        for (int val : list) {
            if (val % x != mod) return -1;
        }
        
        // Step 3: Sort
        Collections.sort(list);
        
        // Step 4: Median
        int median = list.get(list.size() / 2);
        
        // Step 5: Count operations
        int ops = 0;
        for (int val : list) {
            ops += Math.abs(val - median) / x;
        }
        
        return ops;
    }
}