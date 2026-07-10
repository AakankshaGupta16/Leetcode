class Solution {
    public int longestOnes(int[] nums, int k) 
    {
        int n=nums.length;
        int l=0;int max=0;int c=0;
        for(int r=0;r<n;r++)
        {
            if(nums[r]==1)
            c++;
            max=Math.max(max,c);
        }
        return max-1;
        
    }
}