class Solution {
    public int longestConsecutive(int[] nums) 
    {
        int maxlen=0;
        if(nums.length==0)
        return 0;
        if(nums.length==1)
        return 1;
        int c=1;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1]+1)
            c++;
            else if(nums[i]!=nums[i-1])
            c=1;
            maxlen=Math.max(maxlen,c);
        }
        return maxlen;

    }
}