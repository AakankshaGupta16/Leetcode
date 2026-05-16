class Solution 
{
    //CHOICES FOR EVEN INDEX: 0,2,4,6,8
    //ODD: 2,3,5,7
    //ANS: POW(5,even-pos)*POW(4,odd-pos)
    long MOD=1000000007;
    public int countGoodNumbers(long n) 
    {
        long even=(n+1)/2;
        long odd=n/2;
        long ans= (pow(5,even)*pow(4,odd)) % MOD;
        return (int) ans; 
    }
    public long pow(long x,long n)// recursive logic for power
    { 
        if(n==0)
        return 1;
        long half=pow(x,n/2);
        if(n%2==0)
        return (half*half)%MOD;
        else 
        return (half*half)*x %MOD;
    }
}