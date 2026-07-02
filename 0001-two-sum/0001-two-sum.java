class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int ex=target-nums[i];
            if(map.containsKey(ex))
            return new int[]{i,map.get(ex)};
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}