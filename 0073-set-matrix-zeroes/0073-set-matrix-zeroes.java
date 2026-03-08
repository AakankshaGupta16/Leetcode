import java.util.*;

class Solution 
{
    public void setZeroes(int[][] matrix) 
    {
        int r = matrix.length;
        int c = matrix[0].length;

        boolean fr = false, fc = false;

        // Step 1: Check if first column initially contains any zero
        // If yes, we must make the entire first column zero at the end
        for(int i = 0; i < r; i++)
        {
            if(matrix[i][0] == 0) 
                fc = true;
        }

        // Step 2: Check if first row initially contains any zero
        // If yes, we must make the entire first row zero at the end
        for(int i = 0; i < c; i++)
        {
            if(matrix[0][i] == 0) 
                fr = true;
        }

        // Step 3: Traverse the matrix excluding first row and column
        // If a zero is found, mark its row and column using
        // first column and first row as markers
        for(int i = 1; i < r; i++)
        {
            for(int j = 1; j < c; j++)
            {
                if(matrix[i][j] == 0)
                {
                    matrix[i][0] = 0; // mark row
                    matrix[0][j] = 0; // mark column
                }
            }
        }

        // Step 4: Use the markers in first row and column
        // to update the remaining cells of the matrix
        for(int i = 1; i < r; i++)
        {
            for(int j = 1; j < c; j++)
            {
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 5: If first row originally had a zero
        // make the entire first row zero
        if(fr)
        {
            for(int i = 0; i < c; i++) 
                matrix[0][i] = 0;
        }

        // Step 6: If first column originally had a zero
        // make the entire first column zero
        if(fc)
        {
            for(int i = 0; i < r; i++)
                matrix[i][0] = 0;
        }
    }
}