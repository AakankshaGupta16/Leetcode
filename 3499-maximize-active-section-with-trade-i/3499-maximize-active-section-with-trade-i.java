class Solution {
    public int maxActiveSectionsAfterTrade(String s) 
    {
       
        int countOnes =0;
        int maxgain=0;
        ArrayList<Character> run=new ArrayList<>();
        ArrayList<Integer> len=new ArrayList<>();
        char[] charArr = s.toCharArray(); 
        for( char c: charArr)
        {
            if(c=='1') countOnes++;

        }
        String t="1"+s+"1";
        int i=0;
        while(i<t.length())
        {
            char curr=t.charAt(i);
            int j=i;
            while(j<t.length() && curr==t.charAt(j))
            {
                j++;
            }
            run.add(curr);
            len.add(j-i);
            i=j;
        }
    
        for (int k = 1; k < run.size() - 1; k++)
        {
            if(run.get(k)=='1' && run.get(k-1)=='0' && run.get(k+1)=='0')
            {
                int gain=len.get(k-1)+ len.get(k+1);  
                maxgain=Math.max(gain,maxgain);  
            }
         
        }
        return maxgain+countOnes;
    }
}