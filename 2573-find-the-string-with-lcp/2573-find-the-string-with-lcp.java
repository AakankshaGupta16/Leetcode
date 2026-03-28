class Solution {
    public String findTheString(int[][] lcp) {
        int n = lcp.length;
        char[] word = new char[n];
        
        // Step 1: Fill with placeholder
        for (int i = 0; i < n; i++) {
            word[i] = '#';
        }

        char ch = 'a';

        // Step 2: Assign characters
        for (int i = 0; i < n; i++) {
            if (word[i] == '#') {
                if (ch > 'z') return "";
                
                for (int j = i; j < n; j++) {
                    if (lcp[i][j] > 0) {
                        word[j] = ch;
                    }
                }
                ch++;
            }
        }

        // Step 3: Validate
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {

                if (i == n - 1 || j == n - 1) {
                    if (lcp[i][j] != (word[i] == word[j] ? 1 : 0)) {
                        return "";
                    }
                } else {
                    int expected = (word[i] == word[j]) ? 1 + lcp[i + 1][j + 1] : 0;
                    if (lcp[i][j] != expected) {
                        return "";
                    }
                }
            }
        }

        return new String(word);
    }
}