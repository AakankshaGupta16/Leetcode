import java.util.*;

class Fancy {

    static final long MOD = 1_000_000_007;
    List<Long> seq;
    long mul;
    long add;

    public Fancy() {
        seq = new ArrayList<>();
        mul = 1;
        add = 0;
    }

    public void append(int val) {
        long inv = modInverse(mul);
        long stored = ((val - add) % MOD + MOD) % MOD;
        stored = (stored * inv) % MOD;
        seq.add(stored);
    }

    public void addAll(int inc) {
        add = (add + inc) % MOD;
    }

    public void multAll(int m) {
        mul = (mul * m) % MOD;
        add = (add * m) % MOD;
    }

    public int getIndex(int idx) {
        if (idx >= seq.size()) return -1;
        long val = seq.get(idx);
        long res = (val * mul % MOD + add) % MOD;
        return (int) res;
    }

    private long modInverse(long x) {
        return pow(x, MOD - 2);
    }

    private long pow(long x, long y) {
        long res = 1;
        x %= MOD;
        while (y > 0) {
            if ((y & 1) == 1) res = (res * x) % MOD;
            x = (x * x) % MOD;
            y >>= 1;
        }
        return res;
    }
}