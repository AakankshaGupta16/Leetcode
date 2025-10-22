class Solution {
    public int longestConsecutive(int[] nums) 
    {
        Set<Integer> numset=new HashSet<>();
        for(int n:nums)
        numset.add(n);
        int maxlen=0;
        for(int num:numset)
        {
            if(!numset.contains(num-1))
            {
                int currnum=num;
                int currstreak=1;
            
            while(numset.contains(currnum+1))
            {
                currnum++;
                currstreak++;
            }
            maxlen=Math.max(maxlen,currstreak);
            }

        }
        return maxlen;

    }
}

