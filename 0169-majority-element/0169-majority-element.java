class Solution {
    public int majorityElement(int[] arr) 
    {
       HashMap<Integer,Integer> map=new HashMap<>();
       int n=arr.length;
       for(int i=0;i<n;i++)
       {
        int val=map.getOrDefault(arr[i],0);
        map.put(arr[i],val+1);
       }
       for(Map.Entry<Integer,Integer>it: map.entrySet())
       {
        if(it.getValue()>n/2) return it.getKey();
    
       }
        return -1;
        
    }
}