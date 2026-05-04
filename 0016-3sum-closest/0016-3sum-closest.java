class Solution {
    public int threeSumClosest(int[] nums, int target) 
    {
        Arrays.sort(nums);
        int closestsum=nums[0]+nums[1]+nums[2];
        int n=nums.length;
        //int l=0,r=n-1;
        for(int i=0;i<n-2;i++)
        {
            int l=i+1,r=n-1;
            while(l<r)
            {
            int sum=nums[i]+nums[l]+nums[r];
            if(Math.abs(target-sum)< Math.abs(target-closestsum))
            closestsum=sum;
            if(sum<target)
            l++;
            else if(sum>target)
            r--;
            else 
            return sum;
            }

        }
        return closestsum;
    }
}