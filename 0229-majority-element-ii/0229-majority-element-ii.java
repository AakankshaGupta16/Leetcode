class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        int cand1=0,cand2=0,c1=0,c2=0;
        for(int num:nums)
        {
            if(num==cand1) c1++;
            else if (num==cand2) c2++;
            else if (c1==0) 
            {
                cand1=num;
                c1=1;
            }
            else if(c2==0)
            {
                cand2=num;
                c2=1;
            }
            else
            {
                c1--;
                c2--;
            }
       }
       int count1=0,count2=0;
       for(int num:nums)
       {
        if(num==cand1) count1++;
        if(num==cand2 ) count2++;
       }
        if(count1>n/3) ans.add(cand1);
        if(count2>n/3 && cand2 != cand1) ans.add(cand2);
        return ans;
    }
}


