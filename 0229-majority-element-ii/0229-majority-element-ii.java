class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (Map.Entry<Integer, Integer> it : map.entrySet())
        {
            if(it.getValue()>n/3)
            list.add(it.getKey());
        }
        return list;
    }
}