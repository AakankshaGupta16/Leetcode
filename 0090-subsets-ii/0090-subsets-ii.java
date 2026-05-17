class Solution 
{
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        Arrays.sort(nums);
        solve(nums, 0, new ArrayList<>());
        return ans;
    }
    public void solve(int[] nums, int start, List<Integer> list)
    {
        ans.add(new ArrayList<>(list));// Current subset is valid
        for(int i = start; i < nums.length; i++)
        { 
            if(i > start && nums[i] == nums[i - 1])// Skip duplicates at same recursion level
                continue;
            list.add(nums[i]);// Take current element            
            solve(nums, i + 1, list);// Recurse for next indices
            list.remove(list.size() - 1);// Backtrack
        }
    }
}