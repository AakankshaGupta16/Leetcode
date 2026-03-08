import java.util.*;

class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
       HashSet<Integer> set=new HashSet<>();
       int n=nums.length;
       int curr=0,c=0;
       int longest=0;
       for(int num:nums)
       set.add(num);
       for(int num:nums)
       {
            if(!set.contains(num-1))
            {
                curr=num;
                c=1;
            }   
            while(set.contains(curr+1))
            {
                curr++;
                c++;
            }
            longest=Math.max(longest,c);
       }
       return longest;
    }
}