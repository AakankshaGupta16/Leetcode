class Solution {
    public boolean isAnagram(String s, String t) 
    {
        int sl=s.length();
        int tl=t.length();
        if(sl!=tl) return false;
        char ch1[]=s.toCharArray();
        char ch2[]=t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i=0;i<sl;i++)
        {
            if(ch1[i]!=ch2[i])
            return false;
        }
        return true;
    }
}