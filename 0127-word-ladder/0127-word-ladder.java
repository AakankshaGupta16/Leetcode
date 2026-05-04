class Pair
{
    String f;int s;
    Pair(String first, int second)
    {
        this.f=first;
        this.s=second;
    }
}
class Solution 
{
    public int ladderLength(String beginWord, String endWord, List<String> wordList) 
    {
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(beginWord,1));
        Set<String> st=new HashSet<>();
        int len = wordList.size();
        for(int i=0;i<len;i++)
        {
            st.add(wordList.get(i));
        }
        st.remove(beginWord);
        while(!q.isEmpty())
        {
            String word=q.peek().f;
            int steps=q.peek().s;
            q.remove();
            if(word.equals(endWord)==true) return steps;
            for(int i=0;i<word.length();i++)
            {
                for(char ch='a';ch<='z';ch++)
                {
                    char repchararr[]=word.toCharArray();
                    repchararr[i]=ch;
                    String repwrd=new String(repchararr);
                    if(st.contains(repwrd)==true)
                    {   
                        st.remove(repwrd);
                        q.add(new Pair(repwrd,steps+1));
                    }
                }
            }
        }
        return 0;
    }
}