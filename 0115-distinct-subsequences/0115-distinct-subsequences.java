class Solution {
    public int numDistinct(String s, String t) {
        int n = t.length();
        long[] dp = new long[n + 1];
        dp[0] = 1;

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        for (char c : a) {
            for (int j = n; j >= 1; j--) {
                if (c == b[j - 1]) {
                    dp[j] += dp[j - 1];
                }
            }
        }

        return (int) dp[n];
    }
}