class Solution {
    public int findDuplicate(int[] nums) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            if(entry.getValue()>=2)
            return entry.getKey();
        }
        return -1;
    }
}