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
        // Current subset is valid
        ans.add(new ArrayList<>(list));

        for(int i = start; i < nums.length; i++)
        {
            // Skip duplicates at same recursion level
            if(i > start && nums[i] == nums[i - 1])
                continue;

            // Take current element
            list.add(nums[i]);

            // Recurse for next indices
            solve(nums, i + 1, list);

            // Backtrack
            list.remove(list.size() - 1);
        }
    }
}