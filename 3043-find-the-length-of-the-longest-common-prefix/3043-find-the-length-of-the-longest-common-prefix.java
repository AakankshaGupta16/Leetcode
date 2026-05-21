class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {

        HashSet<Integer> prefixes = new HashSet<>();

        // Store all prefixes of arr1
        for (int num : arr1) {
            while (num > 0) {
                prefixes.add(num);
                num /= 10;
            }
        }

        int ans = 0;

        // Find longest matching prefix in arr2
        for (int num : arr2) {

            while (num > 0) {

                if (prefixes.contains(num)) {
                    ans = Math.max(ans, Integer.toString(num).length());
                    break; // longer prefixes checked first
                }

                num /= 10;
            }
        }

        return ans;
    }
}