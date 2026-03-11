class Solution {
    public boolean isAnagram(String s, String t) 
    {
        s=s.toLowerCase();
        t=t.toLowerCase();
        if(s.length()!=t.length()) return false;
        int count[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
                char chs=s.charAt(i);
                char cht=t.charAt(i);
                count[chs-'a']++;
                count[cht-'a']--;
        }
        for(int i=0;i<count.length;i++)
        {
            if(count[i]!=0) return false;
        }
        return true;
    }
}