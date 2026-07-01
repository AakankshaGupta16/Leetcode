class Solution {
    public int subarraySum(int[] nums, int k) 
    {
        int c=0;
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int s=0;
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