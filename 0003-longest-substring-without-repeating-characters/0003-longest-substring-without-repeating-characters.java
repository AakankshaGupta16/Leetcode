class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256]; // stores last seen index of characters
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            // if character was seen and is inside the current window
            if (hash[ch] > 0) {
                // move left to max of current left or after last seen position
                left = Math.max(left, hash[ch]);
            }

            // update the last seen index (+1 to avoid 0 ambiguity)
            hash[ch] = right + 1;

            // update max length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
