class Solution {
    public int removeDuplicates(int[] arr) {
        int n=arr.length;
        int i=0;
        for(int j=0;j<n;j++)
        {
            if(arr[i]!=arr[j])
            {
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
        
    }
}