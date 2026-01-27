class Solution {
    public int majorityElement(int[] arr) 
    {
        int candidate=0;int c=0;
        int n=arr.length;

        for(int i=0;i<n;i++)
        {

            if(c==0) 
            {
                candidate=arr[i];
                c=1;
            }
            else if(candidate==arr[i]) c++;
            else c--;
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==candidate) 
            count++;
        }
        if(count>n/2)
        return candidate;
        else return -1;

        
    }
}