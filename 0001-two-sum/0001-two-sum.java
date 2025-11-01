class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int ex=target-nums[i];
            if(mpp.containsKey(ex))
            return new int[]{i,mpp.get(ex)};
            mpp.put(nums[i],i);

        }
        return new int[]{-1,-1};
        
    }
}