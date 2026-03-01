class Solution {
    public void rotate(int[] nums, int k) 
    {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        
        
    }
    public void reverse(int nums[],int s,int e)
    {
        for(int i=0;i<(e-s+1)/2;i++)
       {
        int t=nums[s+i];
        nums[s+i]=nums[e-i];
        nums[e-i]=t;
       }
    }
}