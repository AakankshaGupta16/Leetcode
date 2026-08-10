class Solution {
    public int subarraySum(int[] nums, int k) 
    {
        int c=0;int s=0;
        Map<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        map.put(0,1);
        for(int i=0;i<n;i++)
        {
            s=s+nums[i];
            if(map.containsKey(s-k))
            c=c+map.get(s-k);
            map.put(s,map.getOrDefault(s,0)+1);
        }
        return c;
        
    }
}