class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        int el1=0,cnt1=0;
        int el2=0,cnt2=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==el1)
            cnt1++;
            else if(nums[i]==el2)
            cnt2++;
            else if(cnt1==0)
            {
                el1=nums[i];
                cnt1++;
            }
            else if(cnt2==0)
            {
                el2=nums[i];
                cnt2++;
            }
            else
            {
                cnt1--;
                cnt2--;
            }

        }
    
    int count1=0,count2=0;
    for(int num:nums)
    {
        if(num==el1)
        count1++;
        else if(num==el2)
        count2++;

    }
    if(count1>n/3)
    list.add(el1);
    if(count2>n/3)
    list.add(el2);
    return list;
    }
}