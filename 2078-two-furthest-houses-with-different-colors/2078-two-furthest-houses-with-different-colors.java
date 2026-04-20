class Solution {
    public int maxDistance(int[] colors) 
    {
        int n=colors.length;
        int j, i;
        int ans=0;
        for(j=n-1;j>=0;j--)
        {
            if(colors[j]!=colors[0])
            ans=Math.max(ans,j-0);
        
        }
        for (i= 0;i<= n-1;i++)
        {
            if(colors[i] != colors[n-1])
            ans = Math.max(ans, (n-1) - i);
        }
        return ans;

    }
}