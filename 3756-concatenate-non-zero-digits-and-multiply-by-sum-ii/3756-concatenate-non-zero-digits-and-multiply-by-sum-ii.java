class Solution {
    static final int MOD = 1000000007;

    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();
        long[] prefixConcat = new long[n + 1];
        long[] prefixSum = new long[n + 1];
        int[] prefixCount = new int[n + 1];
        long[] pow10 = new long[n + 1];

        pow10[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow10[i] = (pow10[i - 1] * 10) % MOD;
        }

        for (int i = 0; i < n; i++) {
            int d = s.charAt(i) - '0';
            prefixConcat[i + 1] = prefixConcat[i];
            prefixSum[i + 1] = prefixSum[i];
            prefixCount[i + 1] = prefixCount[i];
            if (d != 0) {
                prefixConcat[i + 1] = (prefixConcat[i] * 10 + d) % MOD;
                prefixSum[i + 1] = prefixSum[i] + d;
                prefixCount[i + 1] = prefixCount[i] + 1;
            }
        }

        int[] ans = new int[queries.length];
        for (int qi = 0; qi < queries.length; qi++) {
            int l = queries[qi][0], r = queries[qi][1];

            int len = prefixCount[r + 1] - prefixCount[l];
            long x = (prefixConcat[r + 1] - (prefixConcat[l] * pow10[len]) % MOD + MOD) % MOD;
            long sum = prefixSum[r + 1] - prefixSum[l];

            ans[qi] = (int) ((x * sum) % MOD);
        }
        return ans;
    }
}
