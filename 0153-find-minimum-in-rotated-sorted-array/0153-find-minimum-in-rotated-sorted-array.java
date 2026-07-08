class Solution {
    public int findMin(int[] nums) 
    {
        int l=0;int h=nums.length-1;
        while(l<h)
        {
            int mid=(l+h)/2;
             // Minimum is in the right half
            if(nums[mid]>nums[h])
            {
                l=mid+1;

            }
             // Minimum is at mid or in the left half
            else 
            h=mid;

        }
        return nums[l];
        
    }
}