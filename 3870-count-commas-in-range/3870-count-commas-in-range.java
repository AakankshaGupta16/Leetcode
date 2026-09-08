class Solution {
    public int countCommas(int n) 
    {
        int c=0;
        if(n<=999)
        return 0;
        else
        {
            for(int i=1;i<=n;i++)
            {
                if(i<=999)
                continue;
                else
                c++;
            }
        }

        return c;
    }
}