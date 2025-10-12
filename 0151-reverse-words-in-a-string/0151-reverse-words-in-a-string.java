class Solution {
    public String reverseWords(String s) 
    {
        StringBuilder sb=new StringBuilder();
        String wrd[]=s.trim().split("\\s+");//reg ex for split by space
        for(int i=wrd.length-1;i>=0;i--)
        {
            sb.append(wrd[i]);
            if(i!=0)
            sb.append(" ");      
        }
         return sb.toString(); 
    }
       
}