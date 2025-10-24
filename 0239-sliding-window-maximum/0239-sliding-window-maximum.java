class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) 
    {
        Deque<Integer> dq=new LinkedList<>();
        int n=nums.length;
        int result[]=new int [n-k+1];
        for(int i=0;i<nums.length;i++)
        {
            while(!dq.isEmpty() && dq.peek()<i-k+1)
            dq.poll();
            while(!dq.isEmpty() && dq.peekLast()<nums[i])
            dq.pollLast();
            dq.offer(i);
            if(i>=k-1)
            result[i-k+1]=nums[dq.peek()];
        }
        return result;
        
    }
}