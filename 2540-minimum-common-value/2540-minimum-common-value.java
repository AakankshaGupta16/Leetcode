class Solution {
    public int getCommon(int[] nums1, int[] nums2) 
    {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
       // HashSet<Integer>n1=new HashSet<>();
        HashSet<Integer>n2=new HashSet<>();
        //for(int i=0;i<nums1.length;i++)
       // n1.add(nums1[i]);
       for(int i=0;i<nums2.length;i++)
        n2.add(nums2[i]);
        for(int i=0;i<nums1.length;i++)
        {
            int a=nums1[i];
            if(n2.contains(a))
            return a;
        }
        return -1;
    }
}