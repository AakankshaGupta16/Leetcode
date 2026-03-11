class Solution {
    public int myAtoi(String s) 
    {
        int i = 0, n = s.length();
        int sign = 1;
        long num = 0;

        // skip leading spaces
        while(i < n && s.charAt(i) == ' ')
            i++;

        // check sign
        if(i < n && (s.charAt(i) == '-' || s.charAt(i) == '+'))
        {
            if(s.charAt(i) == '-') sign = -1;
            i++;
        }

        // read digits
        while(i < n && Character.isDigit(s.charAt(i)))
        {
            int digit = s.charAt(i) - '0';
            num = num * 10 + digit;

            if(sign * num > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;

            if(sign * num < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            i++;
        }

        return (int)(sign * num);
    }
}