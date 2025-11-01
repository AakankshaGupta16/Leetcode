class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs)
        {
            char[] a=new char[26];;
            for(char c:s.toCharArray()) 
            a[c-'a']++;
            String ss=new String(a);
            if(!map.containsKey(ss)) 
            map.put(ss,new ArrayList<>());
            map.get(ss).add(s);
        }
        return new ArrayList<>(map.values());
    }
}