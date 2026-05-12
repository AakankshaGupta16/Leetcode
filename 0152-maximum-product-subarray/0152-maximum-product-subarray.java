class Solution {
    public int maxProduct(int[] nums) 
    {
        int n=nums.length;
        int ans=nums[0];
        int pdt=1;
        for(int i=0;i<n;i++)
        {
            pdt=1;
            for(int j=i;j<n;j++)
            
            {
                pdt=nums[j]*pdt;
                ans=Math.max(pdt,ans);
            }
        }
        return ans;
    }
}