class Solution {
    public int subsequencePairCount(int[] nums) {
        int MOD = 1_000_000_007;
        int maxVal = 200;

        int[] freq = new int[maxVal + 1];
        for (int num : nums) freq[num]++;

        int[] f = new int[maxVal + 1];
        for (int g = 1; g <= maxVal; g++) {
            for (int multiple = g; multiple <= maxVal; multiple += g) {
                f[g] += freq[multiple];
            }
        }

        long[] sameGcdMultiple = new long[maxVal + 1];
        for (int g = maxVal; g >= 1; g--) {
            if (f[g] == 0) { sameGcdMultiple[g] = 0; continue; }
            sameGcdMultiple[g] = computeSameGcd(nums, g, MOD);
        }

        long[] exact = new long[maxVal + 1];
        for (int g = maxVal; g >= 1; g--) {
            long total = sameGcdMultiple[g];
            for (int multiple = 2 * g; multiple <= maxVal; multiple += g) {
                total = (total - exact[multiple] + MOD) % MOD;
            }
            exact[g] = total;
        }

        long ans = 0;
        for (int g = 1; g <= maxVal; g++) {
            ans = (ans + exact[g]) % MOD;
        }
        return (int) ans;
    }

    private long computeSameGcd(int[] nums, int g, int MOD) {
        java.util.List<Integer> reduced = new java.util.ArrayList<>();
        for (int num : nums) {
            if (num % g == 0) reduced.add(num / g);
        }

        java.util.HashMap<Long, Long> dp = new java.util.HashMap<>();
        dp.put(0L, 1L);
        for (int x : reduced) {
            java.util.HashMap<Long, Long> ndp = new java.util.HashMap<>();
            for (java.util.Map.Entry<Long, Long> e : dp.entrySet()) {
                long key = e.getKey();
                long cnt = e.getValue();
                int gA = (int) (key / 1000);
                int gB = (int) (key % 1000);

                add(ndp, encode(gA, gB), cnt, MOD);
                int ngA = (gA == 0) ? x : gcd(gA, x);
                add(ndp, encode(ngA, gB), cnt, MOD);
                int ngB = (gB == 0) ? x : gcd(gB, x);
                add(ndp, encode(gA, ngB), cnt, MOD);
            }
            dp = ndp;
        }

        long result = 0;
        for (java.util.Map.Entry<Long, Long> e : dp.entrySet()) {
            long key = e.getKey();
            int gA = (int) (key / 1000);
            int gB = (int) (key % 1000);
            if (gA != 0 && gA == gB) {
                result = (result + e.getValue()) % MOD;
            }
        }
        return result;
    }

    private long encode(int a, int b) {
        return (long) a * 1000 + b;
    }

    private void add(java.util.HashMap<Long, Long> map, long key, long val, int MOD) {
        map.merge(key, val, (a, b) -> (a + b) % MOD);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}