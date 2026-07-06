class Solution 
{
    public int minEatingSpeed(int[] piles, int hours) 
    {
        int n=piles.length;
        int max=Integer.MIN_VALUE;
        int th=Integer.MIN_VALUE;
        int ans=-1;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,piles[i]);
        }
        int l=0,h=max;

        while(l<=h)
        {
            int mid=(l+h)/2;
            th=totalhours(piles,mid);
            if(th<=hours)
            {
                ans=mid;
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return ans;
        
    }
    private int totalhours(int arr[],int hrs)
    {
        int th=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
           th += Math.ceil((double)arr[i] / hrs);
        }
        return th;
    }








}