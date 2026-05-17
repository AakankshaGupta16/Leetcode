class Solution {
    public boolean canReach(int[] arr, int start) 
    {
       return dfs(arr, start);
    }
    public boolean dfs(int[] arr,int i)
    {
        if(i < 0 || i >= arr.length)
        return false;
        if(arr[i] == -1)
        return false;
        if(arr[i] == 0)
        return true;
        int jump = arr[i];
        arr[i] = -1;
        return dfs(arr, i + jump) || dfs(arr, i - jump);
    }
}