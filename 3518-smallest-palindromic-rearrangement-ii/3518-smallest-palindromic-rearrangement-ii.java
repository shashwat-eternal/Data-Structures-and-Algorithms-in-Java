import java.math.BigInteger;

class Solution {

    public String smallestPalindrome(String s, int k) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int[] half = new int[26];
        char mid = 0;
        int halfLen = 0;

        for (int i = 0; i < 26; i++) {
            half[i] = freq[i] / 2;
            halfLen += half[i];
            if ((freq[i] & 1) == 1) {
                mid = (char) ('a' + i);
            }
        }

        long total = countWays(half, (long) k);
        if (total < k) {
            return "";
        }

        StringBuilder left = new StringBuilder();

        for (int pos = 0; pos < halfLen; pos++) {
            for (int c = 0; c < 26; c++) {
                if (half[c] == 0) continue;

                half[c]--;

                long ways = countWays(half, (long) k);

                if (ways >= k) {
                    left.append((char) ('a' + c));
                    break;
                } else {
                    k -= ways;
                    half[c]++;
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        ans.append(left);

        if (mid != 0) {
            ans.append(mid);
        }

        ans.append(new StringBuilder(left).reverse());

        return ans.toString();
    }

    private long countWays(int[] cnt, long cap) {
        BigInteger limit = BigInteger.valueOf(cap);
        BigInteger res = BigInteger.ONE;

        int used = 0;

        for (int x : cnt) {
            if (x == 0) continue;

            res = res.multiply(binomial(used + x, x, limit));

            if (res.compareTo(limit) > 0) {
                return cap + 1;
            }

            used += x;
        }

        return res.longValue();
    }

    private BigInteger binomial(int n, int r, BigInteger limit) {
        r = Math.min(r, n - r);

        BigInteger res = BigInteger.ONE;

        for (int i = 1; i <= r; i++) {
            res = res.multiply(BigInteger.valueOf(n - r + i));
            res = res.divide(BigInteger.valueOf(i));

            if (res.compareTo(limit) > 0) {
                return limit.add(BigInteger.ONE);
            }
        }

        return res;
    }
}