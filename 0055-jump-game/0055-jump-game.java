class Solution {
    public boolean canJump(int[] nums) 
    {
        int maxind=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            if(i>maxind) return false;
            maxind=Math.max(nums[i]+i,maxind);
        }
        return true;
        
    }
}