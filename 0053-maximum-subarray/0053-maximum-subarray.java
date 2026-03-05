class Solution {
    public int maxSubArray(int[] nums) 
    {
        int n=nums.length;
        int currsum=0,maxsum=Integer.MIN_VALUE,start=0,ansstart=0,ansend=0;
        for(int i=0;i<n;i++)
        {
            if(currsum==0) start=i;
            currsum+=nums[i];
            if(currsum>maxsum)
            {
                maxsum=currsum;
                ansstart=start;
                ansend=i;
            }
            if(currsum<0)
            currsum=0;
        }
        return maxsum;
        
    }
}