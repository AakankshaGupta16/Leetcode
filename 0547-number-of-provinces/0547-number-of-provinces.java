class Solution {
    public int findCircleNum(int[][] isConnected) 
    {
        int c=0;
        int v=isConnected.length;
        boolean vis[]=new boolean[v];
        for(int i=0;i<v;i++)
        {
            if(!vis[i])
            {
                c++;
                dfs(i, vis,isConnected,v);
            }
        }
        return c;
    }
    public static void dfs(int node, boolean vis[], int isConnected[][], int v)
    {
        vis[node]=true;
        for(int j=0;j<v;j++)
        {
            if(isConnected[node][j]==1 && !vis[j])
            dfs(j, vis,isConnected, v);
        }

    }
}