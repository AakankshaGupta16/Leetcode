class Solution {

    int count = 0;
    String result = "";

    public String getHappyString(int n, int k) {
        backtrack(n, k, new StringBuilder());
        return result;
    }

    private void backtrack(int n, int k, StringBuilder curr) {

        if (curr.length() == n) {
            count++;
            if (count == k) {
                result = curr.toString();
            }
            return;
        }

        for (char c : new char[]{'a', 'b', 'c'}) {

            if (curr.length() > 0 && curr.charAt(curr.length() - 1) == c)
                continue;

            curr.append(c);
            backtrack(n, k, curr);

            if (!result.equals("")) return; // stop early once found

            curr.deleteCharAt(curr.length() - 1);
        }
    }
}