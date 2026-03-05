class Solution {
    public int[] rearrangeArray(int[] nums) 
    {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        int n=nums.length;
        int ans[]=new int[n];
        for(int num:nums)
        {
            if(num>0) pos.add(num);
            else neg.add(num);
        }
        for(int i=0;i<n/2;i++)
        {
            ans[2*i]=pos.get(i);
            ans[2*i+1]=neg.get(i);
        }
        return ans;
    }
}