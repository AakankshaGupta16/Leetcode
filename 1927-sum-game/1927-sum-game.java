class Solution {
    public boolean sumGame(String num) 
    {
        int n=num.length();
        int h;

        if(n%2==0)
        h=n/2;
        else
        h=n/2+1;
        int s1=0,s2=0;
        int q1=0,q2=0;
        for(int i=0;i<h;i++)
        {
            char ch=num.charAt(i);
            if(ch == '?')
                q1++;
            else
                s1 += ch - '0';
            
        }
        for(int i=h; i<n; i++)
        {
            char ch=num.charAt(i);
           if(ch == '?')
                q2++;
            else
                s2 += ch - '0';
        }
        return 2 * (s1 - s2) != 9 * (q2 - q1);

    }
}