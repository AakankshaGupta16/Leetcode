class Solution {
    public List<Integer> spiralOrder(int[][] mat) 
    {
        List<Integer> ans=new ArrayList<>();
        int t = 0;
        int b = mat.length - 1;
        int l = 0;
        int r = mat[0].length - 1;
        while(t<=b && l<=r)
        {
            for(int i=l;i<=r;i++)
            ans.add(mat[t][i]);
            t++;
            for(int i=t;i<=b;i++)
            ans.add(mat[i][r]);
            r--;
            if(t<=b)
            {
                for(int i=r;i>=l;i--)
                ans.add(mat[b][i]);
                b--;
            }
            if(l<=r)
            {
                for(int i=b;i>=t;i--)
                ans.add(mat[i][l]);
                l++;
            }
            
        }
return ans;
        
    }
}