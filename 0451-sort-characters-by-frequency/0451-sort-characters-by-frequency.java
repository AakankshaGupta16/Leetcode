class Solution {
    public String frequencySort(String s) 
    {
        // Step 1: Count frequency
        Map<Character, Integer> freq = new HashMap<>();
        for(char c : s.toCharArray())
            freq.put(c, freq.getOrDefault(c, 0) + 1);

        // Step 2: Create buckets
        List<Character>[] bucket = new List[s.length() + 1];

        for(char c : freq.keySet())
        {
            int f = freq.get(c);
            if(bucket[f] == null)
                bucket[f] = new ArrayList<>();

            bucket[f].add(c);
        }

        // Step 3: Build result
        StringBuilder sb = new StringBuilder();

        for(int i = bucket.length - 1; i >= 0; i--)
        {
            if(bucket[i] != null)
            {
                for(char c : bucket[i])
                {
                    for(int j = 0; j < i; j++)
                        sb.append(c);
                }
            }
        }

        return sb.toString();
    }
}