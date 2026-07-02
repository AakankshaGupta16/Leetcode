class Solution {
    public int maximumWealth(int[][] accounts) 
    {
        int n=accounts.length;
        int maxwealth=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int s=0;
            int m=accounts[i].length;
            for(int j=0;j<m;j++)
            {
                s=s+accounts[i][j];
            }
            maxwealth=Math.max(s,maxwealth);
        }  
        return maxwealth;
    }
}