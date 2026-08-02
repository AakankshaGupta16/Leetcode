class Solution {
    public int findContentChildren(int[] g, int[] s) 
    {
        int n=g.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int l=0;// children pointer
        int r=0;// size pointer
        int c=0;
        while(l<g.length && r<s.length)
        {
            if(g[l]<=s[r])// greed is less than or equal to size cookie used up and child moves
            {
                r++;
                l++;
                c++;
            }
            else// greed not satisfied change cookie size
            r++;
        }
        return c;
    }
}