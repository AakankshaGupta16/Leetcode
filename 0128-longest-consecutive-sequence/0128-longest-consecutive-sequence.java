class Solution {
    public int longestConsecutive(int[] nums) 
    {
        HashSet<Integer> numset=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        numset.add(nums[i]);
        int maxlen=1;
        for(int num:numset)
        {
            if(numset.contains(num-1))
            continue;
            else
            {
                int currnum=num;
                int currlen=1;
                while(numset.contains(currnum+1))
                {
                    currnum++;
                    currlen++;
                }
                maxlen=Math.max(maxlen,currlen);
            }
        }
        return maxlen;
    }
}

