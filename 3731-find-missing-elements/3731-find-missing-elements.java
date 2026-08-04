class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        Arrays.sort(nums);

        int n = nums.length;
        int s = nums[0];
        int e = nums[n - 1];

        int[] hash = new int[e + 1];

        for(int i = 0; i < n; i++) {
            hash[nums[i]]++;
        }

        for(int i = s; i <= e; i++) {
            if(hash[i] == 0)
                ans.add(i);
        }

        return ans;
    }
}