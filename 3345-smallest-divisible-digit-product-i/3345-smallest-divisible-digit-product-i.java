class Solution {
    public int smallestNumber(int n, int t) 
    {
        for(int i = n; ; i++)
        {
            int p = prodofdigits(i);

            if(p % t == 0)
                return i;
        }
    }
    public int prodofdigits(int n)
    {
        int d=0;int prod=1;
        for(int i=n;i>0;i/=10)
        {
            d=i%10;
            prod=prod*d;
        }
        return prod;
    }
}