class Solution {
    public int maxDepth(String s) 
    {
        int n=s.length();int d=0,md=0;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                d++;
                md=Math.max(md,d);
            }
            else if(ch==')')
            {
                d--;
            }

        }
        return md;
        
    }
}