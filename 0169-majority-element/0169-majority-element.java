class Solution {
    public int majorityElement(int[] nums) 
    {
        int n=nums.length;
        int c=0;int el=0;
        for(int i=0;i<n;i++)
        {
            if(c==0)
            {
                el=nums[i];
                c=1;
            }
            else if(nums[i]==el)
            c++;
            else c--;
        }
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==el)
            {
                k++;
            } 
        }
        if(k>n/2)
        return el;
        else return -1;
        
    }
}