class Solution {
    public int[][] rotateGrid(int[][] grid, int k) 
    {
        int r=grid.length;
        int c=grid[0].length;
        int numlayer=(Math.min(r,c))/2;
        int ansmat[][]=new int[r][c];
        for(int i=0;i<numlayer;i++)
        {
            ArrayList<Integer> lay=new ArrayList<>();
            int t = i;
            int lft = i;
            int b = r - i - 1;
            int rgt = c - i - 1;
            for(int j=lft;j<=rgt;j++)//top
            lay.add(grid[t][j]);
            for(int j=t+1;j<=b;j++)//right
            lay.add(grid[j][rgt]);
            for(int j=rgt-1;j>=lft;j--)//bottom
            lay.add(grid[b][j]);
            for(int j=b-1;j>t;j--)//left
            lay.add(grid[j][lft]);
            int rot = k % lay.size();
            ArrayList<Integer> rotated = new ArrayList<>();
            for(int j=0;j<lay.size();j++)
            {
                rotated.add(lay.get((j + rot) % lay.size()));
            }
            int idx = 0;
            for(int j=lft;j<=rgt;j++)
            grid[t][j] = rotated.get(idx++);
            for(int j=t+1;j<=b;j++)
            grid[j][rgt] = rotated.get(idx++);
            for(int j=rgt-1;j>=lft;j--)
            grid[b][j] = rotated.get(idx++);
            for(int j=b-1;j>t;j--)
            grid[j][lft] = rotated.get(idx++);

        }
        return grid;
        
    }
}