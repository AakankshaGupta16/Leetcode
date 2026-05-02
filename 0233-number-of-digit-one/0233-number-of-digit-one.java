class Solution {
    public int countDigitOne(int n) 
    {
        int count = 0;

        for(long f = 1; f <= n; f *= 10)
        {
            long higher = n / (f * 10);
            long current = (n / f) % 10;
            long lower = n % f;

            if(current == 0)
                count += higher * f;
            else if(current == 1)
                count += higher * f + (lower + 1);
            else
                count += (higher + 1) * f;
        }

        return count;
    }
}