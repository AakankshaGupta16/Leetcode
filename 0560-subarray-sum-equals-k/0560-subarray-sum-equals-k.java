class Solution {
    public int subarraySum(int[] nums, int k) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        map.put(0,1);
        int currsum=0,c=0;
        for(int i=0;i<n;i++)
        {
            currsum+=nums[i];
            if(map.containsKey(currsum-k))
            c=c+map.get(currsum-k);
            map.put(currsum,map.getOrDefault(currsum,0)+1);
        }
        return c;
        
    }
}