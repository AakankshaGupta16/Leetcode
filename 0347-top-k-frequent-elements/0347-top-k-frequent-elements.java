class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequencies
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums)
         count.put(n, count.getOrDefault(n, 0) + 1);    
        // Step 2: Create a list of unique numbers
        List<Integer> list = new ArrayList<>(count.keySet());
        // Step 3: Sort the list by frequency in descending order
        list.sort((a, b) -> count.get(b) - count.get(a)); // highest frequency first
        // Step 4: Take first k elements
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) 
        ans[i] = list.get(i);
        return ans;
    }
}
