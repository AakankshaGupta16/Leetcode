class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        Map<Integer,Integer> count=new HashMap<>();
        for(int n:nums)
        count.put(n,count.getOrDefault(n,0)+1);
        List<Integer> list=new ArrayList<>(count.keySet());
        list.sort((a,b)->count.get(b)-count.get(a));
        int ans[]=new int[k];
        for(int i=0;i<k;i++)
        ans[i]=list.get(i);
        return ans;
    }
}