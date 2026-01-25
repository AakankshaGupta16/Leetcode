class Solution {
    public int singleNumber(int[] nums) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int val=map.getOrDefault(nums[i],0);
            map.put(nums[i],val+1);
        }
        for(Map.Entry<Integer,Integer> it: map.entrySet())
        {
            if(it.getValue()==1)
            return it.getKey();
        }

        return -1;
    }
}