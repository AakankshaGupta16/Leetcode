class Solution {
    public int longestConsecutive(int[] nums) 
    {
        int n=nums.length;
        if(n==0) return 0;
        Arrays.sort(nums);
        int c=1,maxlen=1;
        for(int i=1;i<n;i++)
        {
            if(nums[i]==nums[i-1])
            continue;
            if(nums[i]==nums[i-1]+1)
            c++;
            else
            c=1;
            maxlen=Math.max(maxlen,c);
        }
        return maxlen;
        
    }
}