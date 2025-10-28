class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
       HashMap <Integer,Integer> mpp=new HashMap<>();
       int ans[]=new int[2];
       int n=nums.length;
       for(int i=0;i<n;i++)
       {
        int num=nums[i];
        int excess=target-num;
        if(mpp.containsKey(excess))
        {
            ans[0]=mpp.get(excess);
            ans[1]=i;
            return ans;
        }
        mpp.put(nums[i],i);

       }
       return ans;
    }
}