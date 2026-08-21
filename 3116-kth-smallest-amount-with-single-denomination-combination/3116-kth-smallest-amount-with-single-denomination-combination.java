import java.util.*;

class Solution {
    public long findKthSmallest(int[] coins, int k) {
        Arrays.sort(coins);

        List<Integer> a = new ArrayList<>();

        for (int c : coins) {
            boolean skip = false;
            for (int x : a) {
                if (c % x == 0) {
                    skip = true;
                    break;
                }
            }
            if (!skip) a.add(c);
        }

        long lo = 1;
        long hi = (long) a.get(0) * k;

        while (lo < hi) {
            long mid = lo + (hi - lo) / 2;

            if (count(mid, a) >= k)
                hi = mid;
            else
                lo = mid + 1;
        }

        return lo;
    }

    private long count(long x, List<Integer> coins) {
        int n = coins.size();
        long ans = 0;

        for (int mask = 1; mask < (1 << n); mask++) {
            long lcm = 1;
            int bits = 0;

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    bits++;
                    lcm = lcm(lcm, coins.get(i));

                    if (lcm > x) break;
                }
            }

            if (lcm > x) continue;

            if ((bits & 1) == 1)
                ans += x / lcm;
            else
                ans -= x / lcm;
        }

        return ans;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    private long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}