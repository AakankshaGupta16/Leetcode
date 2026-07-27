class Solution {
    public void rotate(int[] nums, int k) 
    {
        int n=nums.length;
        k=k%n;
        reverse(0,n-1,nums);
        reverse(0,k-1,nums);
        reverse(k,n-1,nums);
        
    }
    public void reverse(int s, int e,int nums[])
    {
        for(int i=0;i<(e-s+1)/2;i++)
        {
            int t=nums[s+i];
            nums[s+i]=nums[e-i];
            nums[e-i]=t;

        }
    }
}