class Solution {
    int n;
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> list=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) 
    {
        n=nums.length;
        solve(nums,0,list,ans);
        return ans;
    }
    public void solve(int nums[],int i,List<Integer> list, List<List<Integer>> ans)
    {
            if(i==nums.length) 
            {
                ans.add(new ArrayList<>(list));
                return;
            }
            list.add(nums[i]);
            solve(nums,i+1,list,ans);
            list.remove(list.size()-1);
            solve(nums,i+1,list,ans);


        }
}