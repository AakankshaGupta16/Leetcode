class Solution {
    public int maxProfit(int[] prices) 
    {
        int n=prices.length;
        int minpri=Integer.MAX_VALUE;
        int maxpro=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            minpri=Math.min(prices[i],minpri);
            int profit=prices[i]-minpri;
            maxpro=Math.max(profit,maxpro);
        }
        return maxpro;
    }
}