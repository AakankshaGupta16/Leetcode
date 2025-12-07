class Solution {
    public int[] rearrangeArray(int[] nums) 
    {
        int n=nums.length;
        int pos[]=new int [n/2];
        int i1=0;
        int neg[]=new int[n/2];
        int i2=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<0)
            {
                neg[i1]=nums[i];
                i1++;
            }
            else
            {
                pos[i2]=nums[i];
                i2++;
            }
        }
        for(int i=0;i<n/2;i++)
        {
            nums[2*i]=pos[i];
            nums[2*i+1]=neg[i];
        }
        return nums;
        
    }
}