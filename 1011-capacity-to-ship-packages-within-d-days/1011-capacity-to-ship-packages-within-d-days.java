class Solution {
    public int shipWithinDays(int[] weights, int days) 
    {
        int n=weights.length;
        int max=0;
        int min=Integer.MIN_VALUE;
        int ans=-1;
        for(int i=0;i<n;i++)
        {
            max+=weights[i];
            min=Math.max(weights[i],min);
        }
        int l=min,h=max;int mid;
            while(l<=h)
            {
                mid=(l+h)/2;
                if(capacity(weights,mid)<=days)
                {
                    ans=mid;
                    h=mid-1;
                }
                else
                 l=mid+1;
            }
       return ans;
        
    }
    private int capacity(int arr[],int cap)
    {
        int load=0;int d=1;
        for(int i=0;i<arr.length;i++)
        {
            if(load+arr[i]>cap)
            {
                d++;
                load=arr[i];
            }
            else 
            load+=arr[i];
        }
        return d;

    }
}