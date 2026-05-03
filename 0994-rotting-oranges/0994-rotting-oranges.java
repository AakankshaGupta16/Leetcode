class Pair
{
    int r,c,t;
    Pair(int row, int col,int time)
    {
        this.r=row;
        this.c=col;
        this.t=time;
    }
}
class Solution 
{
    public int orangesRotting(int[][] grid) 
    {
        int n=grid.length;
        int m=grid[0].length;
        int freshcnt=0;
        Queue<Pair> q=new LinkedList<>();
        int vis[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                    vis[i][j]=2;
                    q.add(new Pair(i,j,0));
                }
                else if(grid[i][j]==0)
                {
                    vis[i][j]=0;
                }
                else if(grid[i][j]==1)
                freshcnt++;
            }
        }
        int tm=0;
        int cnt=0;
        int drow[]={-1,0,+1,0};
        int dcol[]={0,+1,0,-1};
        while(!q.isEmpty())
        {
            Pair p=q.poll();
            int r=p.r;
            int c=p.c;
            int t=p.t;
            tm=Math.max(t,tm);
            for(int i=0;i<4;i++)
            {
                int nrow=r+drow[i];
                int ncol=c+dcol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1)
                {
                    q.add(new Pair(nrow,ncol,t+1));
                    vis[nrow][ncol]=1;
                    cnt++;
                }
            }
        }
        if(cnt!=freshcnt) return -1;
        return tm;

        
    }
}