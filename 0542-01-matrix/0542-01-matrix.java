class Node

{
    int f,s,t;
    Node(int first, int second,int third)
    {
        this.f=first;
        this.s=second;
        this.t=third;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) 
    {
        int n=mat.length;
        int m=mat[0].length;
        int vis[][]=new int[n][m];
        int dist[][]=new int [n][m];
        Queue<Node> q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==0)
                {
                    q .add(new Node(i,j,0));
                    vis[i][j]=1;
                }
                else
                vis[i][j]=0;
            }
        }
        int delrow[]={-1,0,+1,0};
        int delcol[]={0,+1,0,-1};
        while(!q.isEmpty())
        {
            int r=q.peek().f;
            int c=q.peek().s;
            int st=q.peek().t;
            q.remove();
            dist[r][c]=st;
            for(int i =0;i<4;i++)
            {
                int nrow=r+delrow[i];
                int ncol=c+delcol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0)
                {
                    vis[nrow][ncol]=1;
                    q.add(new Node(nrow,ncol,st+1));
                }
            }
        }
        return dist;
    }
}