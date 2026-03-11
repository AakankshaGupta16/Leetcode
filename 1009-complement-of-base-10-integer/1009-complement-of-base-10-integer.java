class Solution {
    public int bitwiseComplement(int n) 
    {
        String num=Integer.toBinaryString(n);
        String flip="";
        for(int i=0;i<num.length();i++)
        {
            if(num.charAt(i)=='0') flip+='1';
            else flip+='0';
        }
        int res = Integer.parseInt(flip, 2);
        return res;     
    }
}