class Solution {
    public int maxSubArray(int[] nums) 
    {
        int n=nums.length;int s=0;int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            s=s+nums[i];
            if(s>max)
            max=s;
            if(s<0)
            s=0;
        }
        return max;
    }
}