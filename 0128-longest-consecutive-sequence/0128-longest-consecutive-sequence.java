class Solution {
    public int longestConsecutive(int[] nums) 
    {
        int longest=0;
        for(int i=0;i<nums.length;i++)
        {
            int curr=nums[i];
            int c=1;
            while(contains(nums,curr+1))
            {
                curr++;
                c++;
            }
            longest=Math.max(longest,c);
        }
        return longest;

        
    }
    public static boolean contains(int nums[],int a)
    {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==a)
            return true;

        }
        return false;
    }
}
