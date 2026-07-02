class Solution {
    public int countNegatives(int[][] grid) 
    {
        int c=0;
        for(int row[]: grid)
        {
            int l=0;
            int h=row.length-1;
            while(l<=h)
            {
                int mid=(l+h)/2;
                if(row[mid]<0)
                h=mid-1;
                else 
                l=mid+1;
            }
            c+=row.length-l;
        }
        return c;
        
    }
}