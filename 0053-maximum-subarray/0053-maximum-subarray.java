class Solution {
    public int maxSubArray(int[] nums) 
    {
        int n=nums.length;
        int s=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
           s=Math.max(nums[i],s+nums[i]);
           max=Math.max(s,max);
        }
        return max;
        
    }
}