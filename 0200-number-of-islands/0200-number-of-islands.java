class Pair
{
    int first, second;
    public Pair(int first,int second)
    {
        this.first=first;
        this.second=second;
    }
}

class Solution 
{
    public int numIslands(char[][] grid) 
    {
        int c = grid[0].length;
        int r = grid.length;
        int vis[][] = new int[r][c];
        int cnt = 0;

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                // add visited check
                if(grid[i][j] == '1' && vis[i][j] == 0)
                {
                    bfs(i,j,grid,vis);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private void bfs(int ro,int co,char grid[][],int vis[][] )
    {
        vis[ro][co]=1;
        Queue<Pair> q=new LinkedList<>();

        // push starting node
        q.add(new Pair(ro, co));

        int n=grid.length;
        int m=grid[0].length;

        while(!q.isEmpty())
        {
            int row=q.peek().first;
            int col=q.peek().second;
            q.remove();

            // restrict to 4 directions only
            int delRow[] = {-1, 0, 1, 0};
            int delCol[] = {0, 1, 0, -1};

            for(int i=0;i<4;i++)
            {
                int nrow=row+delRow[i];
                int ncol=col+delCol[i];

                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m 
                   && grid[nrow][ncol]=='1' && vis[nrow][ncol]==0)
                {
                    vis[nrow][ncol]=1;
                    q.add(new Pair(nrow,ncol));
                }
            }
        }
    }
}