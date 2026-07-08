class Solution 
{
    public int minDays(int[] bloomDay, int m, int k) 
    {
       
       int min=bloomDay[0];
       int max=bloomDay[0];
       int n=bloomDay.length;
       for(int i=0;i<n;i++)
       {
            if(bloomDay[i]>max) max=bloomDay[i];
            if(bloomDay[i]<min) min=bloomDay[i];
       }
       int l=min,h=max;
       int mid;int ans=-1;
       if(n<(m*k)) return -1;
       while(l<=h)
       {
            mid=(l+h)/2;
            if(possible(bloomDay,mid,m,k))
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
    private boolean possible(int arr[],int day,int m,int k)
    {
        int noofb=0;
        int cnt=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=day)
            {
                cnt++;
            }
            else
            {
                noofb+=cnt/k;
                cnt=0;
            }

        }
        noofb+=cnt/k;
        if(noofb<m) return false;
        else return true;

    }
}
