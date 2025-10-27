class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int m=matrix[0].length;
        int n=matrix.length;
        int l=0,h=m*n-1;
        int mid,r,c;
        while(l<=h)
        {
            mid=(l+h)/2;
            r=mid/m;c=mid%m;
            if(matrix[r][c]==target)
            return true;
            else if(matrix[r][c]<target)
            l=mid+1;
            else
            h=mid-1;
        }
        return false;
        
    }
}