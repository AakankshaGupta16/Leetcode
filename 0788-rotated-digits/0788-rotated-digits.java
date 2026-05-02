class Solution {
    public int rotatedDigits(int n) 
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            boolean x=validrot(i);
            if(x==true)
            c++;
        }
        return c;
        
    }
    public boolean validrot(int num)
{
    int d;
    boolean changed = false;

    for(int i = num; i > 0; i /= 10)
    {
        d = i % 10;
        if(d == 3 || d == 4 || d == 7)
            return false;
        if(d == 2 || d == 5 || d == 6 || d == 9)
            changed = true;
    }
    return changed;
    }
}