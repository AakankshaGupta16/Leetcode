class Solution {
    public int minFlips(String s) 
    {
        int n=s.length();
        int res=Integer.MAX_VALUE;
        int alt1=0,alt2=0;
        String s2=s+s;
        for(int i=0;i<s2.length();i++)
        {
            char ch=s2.charAt(i);
            char exp1=(i%2==0)?'1':'0';
            char exp2=(i%2==0)?'0':'1';
            if(s2.charAt(i)!=exp1) alt1++;
            if(s2.charAt(i)!=exp2) alt2++;
            if (i >= n) 
            {
                char prev = s2.charAt(i - n);
                char prevExpected1 = ((i - n) % 2 == 0) ? '1' : '0';
                char prevExpected2 = ((i - n) % 2 == 0) ? '0' : '1';
                if (prev != prevExpected1) alt1--;
                if (prev != prevExpected2) alt2--;
            }
             if (i >= n - 1) 
            {
                res = Math.min(res, Math.min(alt1, alt2));
            }

        }
        return res;
    }
}