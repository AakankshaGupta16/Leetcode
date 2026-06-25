class Solution {
    public int maxSubArray(int[] nums) 
    {
        int n=nums.length;
        /*
        int sum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int s=0;
            for(int j=i;j<n;j++)
            {
                s=s+nums[j];
                sum=Math.max(s,sum);                
            }
        }
        return sum;
        */
        int currsum=0;
        int maxsum= Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            currsum=Math.max(nums[i],currsum+nums[i]);
            maxsum=Math.max(maxsum,currsum);
        }
        return maxsum;
        
    }
}