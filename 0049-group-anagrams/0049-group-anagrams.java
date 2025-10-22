class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String,List<String>> mpp=new HashMap<>();
        for(String s:strs)
        {
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(!mpp.containsKey(key))
            mpp.put(key,new ArrayList<>());
            mpp.get(key).add(s);
        }
        return new ArrayList<>(mpp.values());
        
    }
}