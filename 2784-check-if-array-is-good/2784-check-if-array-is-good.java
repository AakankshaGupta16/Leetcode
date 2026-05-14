class Solution {
    public boolean isGood(int[] nums) 
    {
        Arrays.sort(nums);

        int n = nums.length;

        int hash[] = new int[n];

        for(int i = 0; i < n; i++)   // start from 0
        {
            int x = nums[i];

            if(x >= n || x <= 0)     // invalid number check
                return false;

            hash[x]++;
        }

        for(int i = 1; i < n - 1; i++)   // 1 to n-2 should appear once
        {
            if(hash[i] != 1)
                return false;
        }

        if(hash[n - 1] == 2)   // last number should appear twice
            return true;

        return false;
    }
}