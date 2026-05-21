class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {

        HashSet<Integer> set = new HashSet<>();

        // Store all prefixes from arr1
        for (int num : arr1) {
            while (num > 0) {
                set.add(num);
                num /= 10;
            }
        }

        int ans = 0;

        // Check prefixes from arr2
        for (int num : arr2) {

            int temp = num;

            while (temp > 0) {

                if (set.contains(temp)) {
                    ans = Math.max(ans, String.valueOf(temp).length());
                }

                temp /= 10;
            }
        }

        return ans;
    }
}