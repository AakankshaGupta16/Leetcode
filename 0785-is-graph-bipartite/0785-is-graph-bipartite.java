class Solution {
    public boolean isBipartite(int[][] graph) 
    {
        int n=graph.length;
        int color[]=new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++)
        {
            if(color[i]==-1)
            {
                if(dfs(i,0,graph,color)== false)
                return false;
            }
        }
        return true;
    }
    private boolean dfs(int node, int clr, int graph[][],int color[])
    {
        color[node]=clr;
        for(int it: graph[node])
        {
            if(color[it]==-1)// Neighbor has NOT been visited yet.
            {
                if(dfs(it,1-clr,graph,color)==false)//give it opposite color & continue DFS
                return false;
            }
            else if(color[it]==clr)//If adjacent nodes ever get same color → graph is NOT bipartite.
            return false;
        }
        return true;
    }
}


