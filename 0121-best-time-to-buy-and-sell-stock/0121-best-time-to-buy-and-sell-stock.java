class Solution {
    public int maxProfit(int[] prices) 
    {
        int minpri=Integer.MAX_VALUE;
        int maxpro=0;
        int n=prices.length;
        for(int i=0;i<n;i++)
        {
            minpri=Math.min(minpri,prices[i]);
            maxpro=Math.max(maxpro,prices[i]-minpri);
        }
        return maxpro;
    }
}