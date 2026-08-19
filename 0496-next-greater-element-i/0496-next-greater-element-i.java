class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        int ans[]=new int[nums1.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && nums2[i]>=st.peek())
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                map.put(nums2[i],-1);
            }
            else
            {
                map.put(nums2[i],st.peek());
            }
                st.push(nums2[i]);
            


        }
        for(int i=0;i<nums1.length;i++)
        {
            int x=nums1[i];
            if(map.containsKey(x))
            ans[i]=map.get(x);
            else
            ans[i]=-1;
        }
        return ans;
    }
}