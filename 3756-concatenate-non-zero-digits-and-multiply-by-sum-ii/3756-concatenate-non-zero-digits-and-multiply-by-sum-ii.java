class Solution {
    static final int MOD = 1_000_000_007;

    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();

        long[] pref = new long[n + 1];
        int[] sum = new int[n + 1];
        int[] cnt = new int[n + 1];
        long[] pow10 = new long[n + 1];

        pow10[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow10[i] = (pow10[i - 1] * 10) % MOD;
        }

        for (int i = 0; i < n; i++) {
            int d = s.charAt(i) - '0';

            sum[i + 1] = sum[i] + d;
            cnt[i + 1] = cnt[i];

            if (d == 0) {
                pref[i + 1] = pref[i];
            } else {
                cnt[i + 1]++;
                pref[i + 1] = (pref[i] * 10 + d) % MOD;
            }
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            int digitSum = sum[r + 1] - sum[l];
            int nonZero = cnt[r + 1] - cnt[l];

            long x = (pref[r + 1] - (pref[l] * pow10[nonZero]) % MOD + MOD) % MOD;

            ans[i] = (int) ((x * digitSum) % MOD);
        }

        return ans;
    }
}