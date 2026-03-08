class Solution {
    public String findDifferentBinaryString(String[] nums) 
    {
        StringBuilder ans =new StringBuilder();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i].charAt(i)=='0') ans.append(1);
            else ans.append(0);
        }
        return ans.toString();
    }
}