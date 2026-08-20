


class Solution 
{
    public int[] resultArray(int[] nums) 
    {
        int n=nums.length;
        int result[]=new int[n];
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        a1.add(nums[0]);
        a2.add(nums[1]);
        int i1=0;
        int i2=0;
        for(int i=2;i<n;i++)
        {
            if(a1.get(i1)>a2.get(i2))
            {
                a1.add(nums[i]);
                i1++;
            }
            else if(a2.get(i2)>a1.get(i1))
            {
                a2.add(nums[i]);
                i2++;

            }
            else if(a2.get(i2)==a1.get(i1))
            {
                a2.add(nums[i]);
                i2++;
            }
            
        }
        int k=0;
        for(int i=0;i<a1.size();i++)
        {
            result[k]=a1.get(i);
            k++;
        }
        for(int i=0;i<a2.size();i++)
        {
            result[k]=a2.get(i);
            k++;
        }
        return result;

    }
}