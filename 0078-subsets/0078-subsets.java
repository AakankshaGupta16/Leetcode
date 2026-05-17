class Solution 
{
    int n;
    List<Integer> list=new ArrayList<>();
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) 
    {
        n=nums.length;
        solve(nums,0,list,ans);
        return ans;
    }
    public void solve(int nums[],int i,List<Integer> list,List<List<Integer>> ans)
    {
        if(i==nums.length)
        {
            ans.add(new ArrayList<>(list));
            return;
        }     
        int el=nums[i];
        list.add(el);
        solve(nums,i+1,list,ans);
        list.remove(list.size()-1);
        solve(nums,i+1,list,ans);
    }
}