class Solution {
    public String reverseWords(String s) 
    {
        String res = "";
        int n = s.length();

        for(int i = n - 1; i >= 0; )
        {
            while(i >= 0 && s.charAt(i) == ' ')//SKIP SPACE
                i--;
            //if(i < 0) break;

            int j = i;//MARK END OF WORD

            while(i >= 0 && s.charAt(i) != ' ')//MOVE UNTIL YOU FIND A WORD START
                i--;

            res = res + s.substring(i + 1, j + 1) + " ";
        }

        return res.trim();
    }
}