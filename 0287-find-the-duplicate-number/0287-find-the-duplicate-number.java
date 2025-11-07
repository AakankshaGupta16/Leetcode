class Solution 
{
    public int findDuplicate(int[] nums) 
    {
        HashMap <Integer,Integer> mpp=new HashMap<>();
        for(int n:nums)
        mpp.put(n,mpp.getOrDefault(n,0)+1);
        for (Map.Entry<Integer, Integer> entry : mpp.entrySet())
       {
        if(entry.getValue()>=2)
        return entry.getKey();
       }   
       return -1;     
    }
}