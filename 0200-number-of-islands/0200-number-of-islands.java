class Pair
{
    int first,second;
    public Pair(int first,int second)
    {
        this.first=first;
        this.second=second;
    }
}

class Solution {
    public int numIslands(char[][] grid) 
    {
        int cnt=0;
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(vis[i][j]==0 && grid[i][j]=='1')
                {
                    bfs(i,j,n,m,vis,grid);
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public void bfs(int r, int c,int n, int m, int vis[][], char grid[][])
    {
        vis[r][c]=1;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(r,c));
        while(!q.isEmpty())
        {
            int row=q.peek().first;
            int col=q.peek().second;
            q.remove();
            int delrow[]={-1,0,1,0};
            int delcol[]={0,1,0,-1};
            for(int i=0;i<4;i++)
            {
                int nrow=row+delrow[i];
                int ncol=col+delcol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]=='1')
                {
                    vis[nrow][ncol]=1;
                    q.add(new Pair(nrow,ncol));
                }
            }

        }

    }
}