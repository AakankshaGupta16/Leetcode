class Solution {
    public String frequencySort(String s) 
    {
        //Step1:count frequency
        HashMap<Character,Integer> freq=new HashMap<>();
        for(char c:s.toCharArray())
        {
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        //Step2: Sort character by frequency (descending)
        List<Character> chars=new ArrayList<>(freq.keySet());
        Collections.sort(chars,(a,b) -> freq.get(b) - freq.get(a));
        //Step3: Build result
        StringBuilder sb=new StringBuilder();
        for(char c:chars)
        {
            int count=freq.get(c);
            for(int i=0;i<count;i++)
            sb.append(c);
        }
        return sb.toString();
    }
    
}