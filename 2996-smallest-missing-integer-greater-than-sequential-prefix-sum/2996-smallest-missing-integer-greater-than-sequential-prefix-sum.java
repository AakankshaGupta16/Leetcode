class Solution {
    public int missingInteger(int[] nums) 
    {
        int s=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            if(nums[i]==nums[i-1]+1)
            {
                s+=nums[i];
            }
            else break;

        }
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) 
        {
            set.add(num);
        }
        while(set.contains(s)) 
        {
            s++;
        }

     return s;   
    }
}