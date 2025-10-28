class Solution {
    public int findMin(int[] nums) 
    {
        int n=nums.length;
        int l=0,h=n-1;
        int ans=Integer.MAX_VALUE;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(nums[l]<=nums[mid])
            {
                ans=Math.min(ans,nums[l]);
                l=l+1;
            }
            else
            {
                ans=Math.min(ans,nums[mid]);
                h=h-1;
            }
        }
        return ans;

    }
}