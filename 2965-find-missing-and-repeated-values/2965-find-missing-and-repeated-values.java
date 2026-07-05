class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=grid.length;int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            }        
        }
        int rep=-1,mis=-1;
        for(int i=1;i<=n*n;i++)
        {
            if(!map.containsKey(i))
            mis=i;
            else if (map.get(i)==2)
            rep=i;
        }
        return new int[]{rep,mis};
        
        
    }
}