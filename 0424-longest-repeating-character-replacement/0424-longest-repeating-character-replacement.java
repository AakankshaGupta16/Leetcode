class Solution {
    public int characterReplacement(String s, int k) 
    {
        int l=0,r=0,maxlen=0,maxfreq=0;
        int hash[]=new int[26];
        while(r<s.length())
        {
            char ch=s.charAt(r);
            hash[ch-'A']++;
            maxfreq=Math.max(maxfreq,hash[ch-'A']);
            if((r-l+1)-maxfreq>k)
            {
                char chr=s.charAt(l);
                hash[chr-'A']--;
                maxfreq=0;
                l=l+1;
            }
            if((r-l+1)-maxfreq<=k)
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}