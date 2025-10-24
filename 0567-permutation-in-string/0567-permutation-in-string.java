class Solution {
    public boolean checkInclusion(String s1, String s2) 
    {
        int len1=s1.length();
        int len2=s2.length();
        if(len1>len2) return false;
        int s1map[]=new int[26];
        int s2map[]=new int[26];
        for(int i=0;i<len1;i++)
        {
            
            s1map[s1.charAt(i)-'a']++;
            s2map[s2.charAt(i)-'a']++;
        }
        for(int i= 0;i<len2-len1;i++)
        {
            if(matches(s1map,s2map))
            return true;
            s2map[s2.charAt(i+len1)-'a']++;
            s2map[s2.charAt(i)-'a']--;
        }
        return matches(s1map,s2map);
    }
    public static boolean matches(int s1map[],int s2map[])
    {
        for(int i=0;i<26;i++)
       {
        if(s1map[i]!=s2map[i])
        return false;
       } 
       return true;
    }
}