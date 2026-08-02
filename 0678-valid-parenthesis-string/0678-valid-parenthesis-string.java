class Solution {
    public boolean checkValidString(String s) 
    {
        int l=0,h=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                l++;
                h++;
            }
            else if (ch==')')
            {
                l--;
                h--;

            }
            else if(ch=='*')
            {
                l--;
                h++;
            }
            if(h<0) return false;
            if(l<0) l=0;

        }
        if(l==0) return true;
        else return false;
        
    }
}