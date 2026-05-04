class Pair
{
    int f,s;
    Pair(int first,int second)
    {
        this.f=first;
        this.s=second;
    }
}
class Solution {
    public int numEnclaves(int[][] grid) 
    {
        int cnt=0;
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair>q=new LinkedList<>();
        int drow[]={-1,0,+1,0};
        int dcol[]={0,1,0,-1};
        int vis[][]=new int[n][m];
        int tot=0;
        //mark visited array and count the number of boundary 1s
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==0 || j==0 || i==n-1 || j==m-1)
                {
                    if(grid[i][j]==1)
                    {
                        q.add(new Pair(i,j));
                        vis[i][j]=1;
                    }
                }
            }
            
        }
        //BFS logic for marking all connected 1s
        while(!q.isEmpty())
        {
            int r=q.peek().f;
            int c=q.peek().s;
            q.remove();
            for(int i=0;i<4;i++)
            {
                int nrow=r+drow[i];
                int ncol=c+dcol[i];
                while(nrow>=0 && ncol>=0 && nrow<n && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1)
                {
                    vis[nrow][ncol]=1;
                    q.add(new Pair(nrow,ncol));
                }

            }
        }
        // an enclave must be not visited in BFS traversal and have 1 in grid value
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1 && vis[i][j]==0)
                cnt++;
            }
        }
        return cnt;
        
    }
}