class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int  c=0,maxcount=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)
            {
                c++;
                maxcount=Math.max(c,maxcount);
            }
            else
            c=0;
        }
        return maxcount;
        
    }
}