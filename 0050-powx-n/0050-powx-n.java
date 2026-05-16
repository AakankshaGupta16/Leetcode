class Solution 
{
    public double myPow(double x, int n) 
    {
        long nn=n;
        if(nn<0)
        {
            x=1/x;
            nn=-nn;
        }
        return power(x,nn);
        
    }
    public static double power(double x,long n)
    {
        if(n==0)
        return 1.0;//base case
        double half=power(x,n/2);
        if(n%2==0)
        return half*half;//n is even
        else
        return x*half*half;//n is odd
    }
}


