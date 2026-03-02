class Solution {
   public int[] twoSum(int[] nums, int target) 
    {
        Map<Integer,Integer> mpp=new HashMap<>();
        int n=nums.length;int ex;
        for(int i=0;i<n;i++)
        {
            ex=target-nums[i];
            if(mpp.containsKey(ex))
            return new int []{i,mpp.get(ex)};
            mpp.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}