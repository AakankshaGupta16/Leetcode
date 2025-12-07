class Solution {
    public int majorityElement(int[] arr) 
    {
        int n=arr.length;
        Map<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int val=mpp.getOrDefault(arr[i],0);
            mpp.put(arr[i],val+1);
        }
        for(Map.Entry<Integer,Integer> it:mpp.entrySet())
        {
            if(it.getValue()>(n/2)) 
            return it.getKey();
        }
        return -1;

        
    }
}