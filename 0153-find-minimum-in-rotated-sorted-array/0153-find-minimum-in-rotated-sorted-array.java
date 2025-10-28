class Solution {
    public int findMin(int[] nums) 
    {
        int ans=Integer.MAX_VALUE;
        int n=nums.length;
        int low=0,high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[low]<=nums[mid])
            {
                ans=Math.min(ans,nums[low]);
                low=low+1;
            }
            else
            {
                ans=Math.min(ans,nums[mid]);
                high=high-1;
            }
        }
        return ans;
        
    }
}