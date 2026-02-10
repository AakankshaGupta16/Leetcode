class Solution {
    public int singleNumber(int[] nums) 
    {
        HashMap <Integer,Integer> mpp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int val=mpp.getOrDefault(nums[i],0);
            mpp.put(nums[i],val+1);

        }
        for(Map.Entry<Integer,Integer> it: mpp.entrySet())
        {
            if(it.getValue()==1)
            return it.getKey();
        }
        return -1;

        
    }
}