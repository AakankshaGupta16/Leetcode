class Solution {
    public String minWindow(String s, String t) 
    {
        int hash[]=new int[256];
        int l=0,r=0,minlen=(int)Math.pow(10,9);
        int sind=-1,cnt=0;
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            hash[ch]++;
        }
        while(r<s.length())
        {
            char chr=s.charAt(r);hash[chr]--;
            if(hash[chr]>=0)
            cnt++;
            
            while(cnt==t.length())
            {
                if((r-l+1)<minlen)
                {
                minlen=r-l+1;
                sind=l;
                }
                char chrr=s.charAt(l);
                hash[chrr]++;
                if(hash[chrr]>0) cnt--;
              l++;
            }
            r++;
        }
        return (sind==-1)?"":s.substring(sind,sind+minlen);

        
    }
}