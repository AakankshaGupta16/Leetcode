class Solution {
    public int beautySum(String s) 
    {
        int ans = 0, n = s.length();
        for(int i = 0; i < n; i++)
        {
            int freq[] = new int[26];
            for(int j = i; j < n; j++)
            {
                freq[s.charAt(j) - 'a']++;
                int maxfreq = 0;
                int minfreq = Integer.MAX_VALUE;
                for(int k = 0; k < 26; k++)
                {
                    if(freq[k] == 0) continue;
                    maxfreq = Math.max(maxfreq, freq[k]);
                    minfreq = Math.min(minfreq, freq[k]);
                }
                ans += maxfreq - minfreq;
            }
        }
        return ans;   
    }
}