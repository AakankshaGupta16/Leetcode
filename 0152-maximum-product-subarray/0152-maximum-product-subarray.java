class Solution {
    public int maxProduct(int[] nums) 
    {
        int n=nums.length;
        int maxpdt=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int pdt=1;
            for(int j=i;j<n;j++)
            {
                pdt*=nums[j];
                maxpdt=Math.max(pdt,maxpdt);
            }
        }
        return maxpdt;
        

        
    }
}