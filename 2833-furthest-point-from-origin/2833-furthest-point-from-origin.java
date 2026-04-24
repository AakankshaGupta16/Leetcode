class Solution {
    public int furthestDistanceFromOrigin(String moves) 
    {

        int l=0,r=0,b=0;
        for(char c:moves.toCharArray())
        {
            if(c=='L') l++;
            else if(c=='R') r++;
            else if(c=='_') b++;

        }
        return Math.abs(r-l)+b;
        
    }
}