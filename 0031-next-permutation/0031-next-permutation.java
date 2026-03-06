class Solution {
    public void nextPermutation(int[] arr) 
    {
        int ind=0;
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i-1]<arr[i])
            {
                ind=i;
                break;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i-1]>arr[i])
            swap(arr,i,ind);
        }

    }
    public void swap(int arr[], int i1,int ind)
    {
        int t=arr[i1];
        arr[i1]=arr[ind];
        arr[ind]=t;
        reverse(arr,i1);

    }
    public void reverse(int arr,int i2)
    {
        int n=arr.length;
        for(int i=0;i<i2/2;i++)
        {
            int t=arr[i];
            arr[i]=arr[i2];
            arr[i2]=t;
        }
    }
}