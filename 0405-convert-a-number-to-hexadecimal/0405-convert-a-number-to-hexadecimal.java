class Solution {
    public String toHex(int num) 
    {
        if(num == 0) return "0";

        char[] map = {
            '0','1','2','3','4','5','6','7',
            '8','9','a','b','c','d','e','f'
        };

        StringBuilder res = new StringBuilder();

        while(num != 0)
        {
            int rem = num & 15;   // same as num % 16
            res.append(map[rem]);
            num >>>= 4;          // unsigned divide by 16
        }

        return res.reverse().toString();
    }
}