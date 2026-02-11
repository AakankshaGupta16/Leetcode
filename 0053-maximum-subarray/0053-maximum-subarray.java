class Solution {
    public int maxSubArray(int[] nums) 
    {
        int n=nums.length;
        int currsum=0,maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            currsum=Math.max(nums[i],currsum+nums[i]);
            maxsum=Math.max(currsum,maxsum);
        }
        return maxsum;
    }
}