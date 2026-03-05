class Solution {
    public int minOperations(String s) {

        int changes0 = 0;
        int changes1 = 0;

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(i % 2 == 0) {
                if(ch != '0') changes0++;
                if(ch != '1') changes1++;
            }
            else {
                if(ch != '1') changes0++;
                if(ch != '0') changes1++;
            }
        }

        return Math.min(changes0, changes1);
    }
}