class Solution {
    public boolean canBeEqual(String s1, String s2) {

        char a = s1.charAt(0), b = s1.charAt(2);
        char c = s2.charAt(0), d = s2.charAt(2);

        boolean even = (a == c && b == d) || (a == d && b == c);

        char e = s1.charAt(1), f = s1.charAt(3);
        char g = s2.charAt(1), h = s2.charAt(3);

        boolean odd = (e == g && f == h) || (e == h && f == g);

        return even && odd;
    }
}