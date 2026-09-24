class Solution {
    public int smallestIndex(int[] nums) 
    {
        int n=nums.length;
        int m=Integer.MAX_VALUE;
        int sum[]=new int [n];
        for(int i=0;i<n;i++)
        {
            int s=sumdig(nums[i]);
            if(s==i)
            {
                m=Math.min(m,i);
            }

        }
        return m==Integer.MAX_VALUE?-1:m;
        
    }
    public int sumdig(int n)
    {
        int x=0,d;
        for(int i=n;i>0;i/=10)
        {
            d=i%10;
            x=x+d;
        }
        return x;
    }
}