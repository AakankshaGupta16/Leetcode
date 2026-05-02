class Solution {
    public int atMostNGivenDigitSet(String[] digits, int n) 
    {
        String s = String.valueOf(n);
        int len = s.length();
        int k = digits.length;

        int total = 0;

        // 1️⃣ Count numbers with length < len(n)
        for(int i = 1; i < len; i++)
        {
            total += Math.pow(k, i);
        }

        // 2️⃣ Count numbers with same length
        for(int i = 0; i < len; i++)
        {
            boolean match = false;

            for(String d : digits)
            {
                if(d.charAt(0) < s.charAt(i))
                {
                    total += Math.pow(k, len - i - 1);
                }
                else if(d.charAt(0) == s.charAt(i))
                {
                    match = true;
                }
            }

            // If current digit not present → stop
            if(!match) return total;
        }

        // If all digits matched → include n itself
        return total + 1;
    }
}