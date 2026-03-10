class Solution {
    public String removeOuterParentheses(String s) 
    { 
        int open=0,close=0,start=0;int balc=0;
        String res="";
        for(int i=0;i<s.length();i++)
        {
           
            
            char ch=s.charAt(i);
            if(ch=='(') open++;
            else if (ch==')') close++;
            balc=open -close;
            if(balc==0)
            {
                
                res+=s.substring(start+1,i);
                start=i+1;
            }

        }
        return res;
    }
}