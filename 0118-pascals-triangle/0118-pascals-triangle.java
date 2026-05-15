class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++)
        {
            ans.add(functgetel(i));
   
        }
        return ans;
        
    }
    public List<Integer> functgetel(int n)
    {
        int res=1;
        List<Integer> row=new ArrayList<>();
        row.add(res);
        for(int i=1;i<n;i++)
        {
            res=res*(n-i);
            res=res/(i);
            row.add(res);
        }
        return row;
    }
}