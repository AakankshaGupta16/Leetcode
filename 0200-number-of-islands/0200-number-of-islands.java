class Pair
{
    int r,c;
    Pair(int row, int column)
    {
        this.r=row;
        this.c=column;
    }
}
class Solution 
{
    public int numIslands(char[][] grid) 
    {
        int cnt=0;
        int row=grid.length;
        int col=grid[0].length;
        int vis[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[row][col]==1 && vis[row][col]==0)
                {
                    bfs(vis,grid,row,col);
                    cnt++;
                }
            }
        }
        
        return cnt;
    }
    private static void bfs(int vis[][], int grid[][], int row,int col)
    {
        Queue<Pair> q=new LinkedList<>();
        vis[row][col]=1;
        q.add(new Pair(row,col));
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

