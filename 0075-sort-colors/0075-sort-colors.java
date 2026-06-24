class Solution {
    public void sortColors(int[] nums) 
    {
        int n=nums.length;
        int cnt1=0,cnt0=0,cnt2=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            cnt0++;
            else if(nums[i]==1)
            cnt1++;
            else cnt2++;
        }
        int k=0;
            while(cnt0>0)
            {
                nums[k++]=0;
                cnt0--;
            }
            while(cnt1>0)
            {
                nums[k++]=1;
                cnt1--;
            }
            while(cnt2>0)
            {
                nums[k++]=2;
                cnt2--;
            }
        
        
    }
}