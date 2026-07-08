class Solution {
    public int smallestDivisor(int[] nums, int threshold) 
    {
        int max=nums[0];
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,nums[i]);
        }
        int ans=-1;int mid;
        int l=1,h=max;
        while(l<=h)
        {
            mid=(l+h)/2;
            if(divsum(nums,mid,threshold))
            {
                ans=mid;
                h=mid-1;
            }
            else
                l=mid+1;
        }
        return ans;
    }
    private boolean divsum(int arr[],int d,int t)
    {
        int s=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            s += (int)Math.ceil((double)arr[i] / d);
        }
        if(s<=t) return true;
        else return false;
    }
}