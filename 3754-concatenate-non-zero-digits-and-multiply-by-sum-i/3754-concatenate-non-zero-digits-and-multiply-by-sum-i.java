class Solution 
{
    public long sumAndMultiply(int n) 
    {
        long rev = 0;
        for (int i = n; i > 0; i /= 10) 
        {
            rev = rev * 10 + i % 10;
        }

        long sum = 0;
        long no = 0;
     
        for (long i = rev; i > 0; i /= 10) 
        {
            int d = (int)(i % 10);
            if (d != 0) 
            {
                no = no * 10 + d;
                sum += d;
            }
        }

        return no * sum;
    }
}