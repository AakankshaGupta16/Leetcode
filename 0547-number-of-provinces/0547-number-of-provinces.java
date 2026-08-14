class Solution {
    public int findCircleNum(int[][] isConnected) 
    {
        int n=isConnected.length;
        boolean vis[]=new boolean[n];
        int province=0;
        for(int i=0;i<n;i++)
        {
            if(vis[i]==false)
            {
               
                dfs(i,vis,isConnected,n); province++;
            }
        }
        return province;
    }
    public void dfs(int node, boolean vis[], int isConnected[][],int n)
    {
        vis[node]=true;
        for(int i=0;i<n;i++)
        {
            if(isConnected[node][i]==1)
            {
                if(vis[i]==false)
                dfs(i,vis,isConnected,n);

            }
        }
    }
}