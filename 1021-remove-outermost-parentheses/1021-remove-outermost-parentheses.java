class Solution {
    public String removeOuterParentheses(String s) 
    { 
        int d=0;
        String res="";
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                if(d>0) res+='(';
                d++;
            }     
            else if (ch==')')
            {
                d--;
                if(d>0) res=res+')';
            } 
        }
        return res;
    }
}



