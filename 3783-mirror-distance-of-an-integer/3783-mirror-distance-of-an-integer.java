class Solution {
    public int mirrorDistance(int n) 
    {
        int rev=reverse(n);
        int ans= Math.abs(n-rev);
        return ans;
        
    }
    private int reverse(int n)
    {
        int d=0,s=0;
        for(int i=n;i>0;i/=10)
        {
            d=i%10;
            s=s*10+d;
        }
        return s;
    
    }
}