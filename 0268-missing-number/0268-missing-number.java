class Solution 
{
    public int missingNumber(int[] nums) 
    {
        int n = nums.length;
        int s=0;
        int sum=n*(n+1)/2;
        for(int i=0;i<n;i++)
        s=s+nums[i];
        return sum-s;
    }
}
