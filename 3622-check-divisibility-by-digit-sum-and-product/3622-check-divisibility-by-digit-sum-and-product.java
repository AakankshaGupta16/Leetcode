class Solution {
    public boolean checkDivisibility(int n) 
    {
        int d=0,s=0,p=1;
        for(int i=n;i>0;i/=10)
        {
            d=i%10;
            p=p*d;
            s=s+d;
        }
        int sum=s+p;
        if(n%sum==0)    
        return true;
        else return false;
    }
}