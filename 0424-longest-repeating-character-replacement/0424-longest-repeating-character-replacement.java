class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26]; // frequency of each uppercase letter
        int left = 0, maxFreq = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            freq[ch - 'A']++;                     // increase freq of this char

            // track the most frequent character in current window
            maxFreq = Math.max(maxFreq, freq[ch - 'A']);

            // if replacements needed exceed k → shrink window from left
            while ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;     // remove leftmost char
                left++;
            }

            // update max window length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
