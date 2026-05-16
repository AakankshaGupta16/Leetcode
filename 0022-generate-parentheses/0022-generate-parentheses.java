class Solution 
{
    int n;
    List<String> ans=new ArrayList();
    public List<String> generateParenthesis(int n) 
    {
        this.n=n;
        solve("",0,0);
        return ans;
    }
    public void solve(String str, int open,int close)
    {
        if(open == n && close == n)
        {
            ans.add(str);
            return;
        }
        if(open<n)
        {
            solve(str+"(",open+1,close);
   
        }
        if(close<open)
        {
           solve(str+")",open,close+1);
        }

    }
}