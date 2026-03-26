class Solution {
    public boolean isValid(String s) 
    {
       Stack<Character> st=new Stack<>();
       int n=s.length();
       for(int i=0;i<n;i++)
       {
        char ch=s.charAt(i);
        if(ch=='[' || ch=='{' || ch=='(')
        st.push(ch);
        else
        {
            if(st.isEmpty()) return false;//cannot pop from an empty stack so check first
            char top = st.peek();
            if((ch==')' && top!='(') ||
            (ch=='}' && top!='{') ||
            (ch==']' && top!='['))
            {
                return false;
            }
            st.pop();
        }
       } 
       return st.isEmpty();
    }
}