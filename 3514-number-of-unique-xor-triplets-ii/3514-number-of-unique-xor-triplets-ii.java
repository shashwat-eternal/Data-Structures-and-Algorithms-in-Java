class Solution {
    public int uniqueXorTriplets(int[] nums) {
        final int MAXX = 2048;

        boolean[] present = new boolean[MAXX];
        int[] values = new int[nums.length];
        int m = 0;

        for (int num : nums) {
            if (!present[num]) {
                present[num] = true;
                values[m++] = num;
            }
        }

        boolean[] dp = new boolean[MAXX];
        dp[0] = true;

        for (int step = 0; step < 3; step++) {
            boolean[] next = new boolean[MAXX];

            for (int x = 0; x < MAXX; x++) {
                if (!dp[x]) continue;

                for (int i = 0; i < m; i++) {
                    next[x ^ values[i]] = true;
                }
            }

            dp = next;
        }

        int ans = 0;
        for (boolean b : dp) {
            if (b) ans++;
        }

        return ans;
    }
}