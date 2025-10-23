class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen = 0;
        
        for (int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> map = new HashMap<>(); // move inside i-loop
            int len = 0;

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (map.containsKey(ch)) {
                    break;
                }
                map.put(ch, 1);
                len = j - i + 1;
                maxlen = Math.max(maxlen, len);
            }
        }
        return maxlen;
    }
}
