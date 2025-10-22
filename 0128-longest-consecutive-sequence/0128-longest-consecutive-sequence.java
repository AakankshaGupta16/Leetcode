class Solution {
    public int longestConsecutive(int[] nums) 
    {
        int maxlen=0;
        int n=nums.length;int c=1;
        if(nums.length==1) return 1;
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        for(int i=1;i<n;i++)
        {
            if(nums[i]==nums[i-1]+1)
            c++;
            else if (nums[i] != nums[i - 1]) 
            c = 1;
            maxlen=Math.max(maxlen,c);
        }
        return maxlen;
    }
}