class Solution {
    public int maxProduct(int[] nums) 
    {
       int n=nums.length;
       int minprod=nums[0];
       int maxprod=nums[0];
       int res=nums[0];
       for(int i=1;i<n;i++)
       {
            int curr=nums[i];
            if(curr<0)
            {
                int t=maxprod;
                maxprod=minprod;
                minprod=t;
            }
            maxprod=Math.max(curr,maxprod*curr);
            minprod=Math.min(curr,minprod*curr);
            res=Math.max(res,maxprod);
       }
       return res;

    }
}

