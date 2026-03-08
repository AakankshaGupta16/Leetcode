class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
       int n=nums.length;
       int maxlen=Integer.MIN_VALUE;
       int c=0;
       if(n==1) return 1;
       if(n==0) return 0;
       for(int i=1;i<n;i++)
       {
        if(nums[i]==nums[i-1]+1)
        c++;
        else if(nums[i]!=nums[i-1]+1)
        c=1;
        maxlen=Math.max(maxlen,c);
       }
       return maxlen;
    }
}


