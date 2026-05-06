class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) 
    {
        int r=boxGrid.length;
        int c=boxGrid[0].length;
        for(int i=0;i<r;i++)
        {
            int empty= c-1;
            for(int j=c-1;j>=0;j--)
            {
                
                if(boxGrid[i][j]=='*')
                empty=j-1;
                else if(boxGrid[i][j]=='#')
                {
                    char t=boxGrid[i][j];
                    boxGrid[i][j]=boxGrid[i][empty];
                    boxGrid[i][empty]=t;
                    empty=empty-1;
                }

            }

        }
        char ans[][] = new char[c][r];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                ans[j][r-1-i]=boxGrid[i][j];
            }
        }
        return ans;
    }
}