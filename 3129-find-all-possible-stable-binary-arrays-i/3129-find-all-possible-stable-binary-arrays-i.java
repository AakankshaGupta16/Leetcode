class Solution {

    int MOD = 1000000007;

    public int numberOfStableArrays(int zero, int one, int limit) {

        long[][][][] dp = new long[zero + 1][one + 1][2][limit + 1];

        if (zero > 0)
            dp[1][0][0][1] = 1;

        if (one > 0)
            dp[0][1][1][1] = 1;

        for (int z = 0; z <= zero; z++) {
            for (int o = 0; o <= one; o++) {

                for (int last = 0; last < 2; last++) {

                    for (int run = 1; run <= limit; run++) {

                        long cur = dp[z][o][last][run];
                        if (cur == 0) continue;

                        if (last == 0) {

                            if (z + 1 <= zero && run + 1 <= limit)
                                dp[z + 1][o][0][run + 1] =
                                        (dp[z + 1][o][0][run + 1] + cur) % MOD;

                            if (o + 1 <= one)
                                dp[z][o + 1][1][1] =
                                        (dp[z][o + 1][1][1] + cur) % MOD;

                        } else {

                            if (o + 1 <= one && run + 1 <= limit)
                                dp[z][o + 1][1][run + 1] =
                                        (dp[z][o + 1][1][run + 1] + cur) % MOD;

                            if (z + 1 <= zero)
                                dp[z + 1][o][0][1] =
                                        (dp[z + 1][o][0][1] + cur) % MOD;
                        }
                    }
                }
            }
        }

        long ans = 0;

        for (int run = 1; run <= limit; run++) {
            ans = (ans + dp[zero][one][0][run]) % MOD;
            ans = (ans + dp[zero][one][1][run]) % MOD;
        }

        return (int) ans;
    }
}