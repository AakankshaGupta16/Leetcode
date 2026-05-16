class Solution 
{
    List<String> ans=new ArrayList<>();
    int n;
    public List<String> validStrings(int n) 
    {
        
        solve("",n);
        return ans;
        
    }
    public void solve(String str, int n)
    {
        if(str.length() == n)
        {
            ans.add(str);
            return;
        }
        solve(str + "1",n);
        if(str.length() == 0 || str.charAt(str.length()-1) != '0')
        solve(str+'0',n);

    }
}