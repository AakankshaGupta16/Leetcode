class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) 
    {
        int m=grid.size();
        int n=grid.get(0).size();
        int [][]best=new int [m][n];
        for(int row[]:best)
        Arrays.fill(row,-1);


        int sthealth=health-grid.get(0).get(0);
        if(sthealth<=0) return false;
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{0,0,sthealth});
        best[0][0]=sthealth;
        int dr[]={-1,1,0,0};
        int dc[]={0,0,-1,1};
        while(!q.isEmpty())
        {
            int cur[]=q.poll();
            int r=cur[0];
            int c=cur[1];
            int h=cur[2];
            if(r==m-1 && c==n-1 )
            return true;
            for(int k=0;k<4;k++)
            {
                int nr=r+dr[k];
                int nc=c+dc[k];
                if(nr<0 || nr>=m || nc<0 || nc>=n)
                continue;
                int nhealth=h-grid.get(nr).get(nc);
                if(nhealth<=0)
                continue;
                if(nhealth>best[nr][nc])
                {
                    best[nr][nc]=nhealth;
                    q.offer(new int []{nr,nc,nhealth});
                }
            }
        }
        return false;
        
    }
}