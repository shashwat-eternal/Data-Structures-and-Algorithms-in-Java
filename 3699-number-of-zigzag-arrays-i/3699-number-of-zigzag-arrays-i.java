class Solution {
    static final int MOD = 1000000007;

    public int zigZagArrays(int n, int l, int r) {
        int m = r - l + 1;
        long[][] dpUp = new long[n + 1][m];   // dir = 1 (next must go up)
        long[][] dpDown = new long[n + 1][m]; // dir = 0 (next must go down)

        // Initialize: sequences of length 1
        for (int x = 0; x < m; x++) {
            dpUp[1][x] = 1;
            dpDown[1][x] = 1;
        }

        for (int i = 1; i < n; i++) {
            long[] prefixUp = new long[m + 1];
            long[] prefixDown = new long[m + 1];

            for (int x = 0; x < m; x++) {
                prefixUp[x + 1] = (prefixUp[x] + dpUp[i][x]) % MOD;
                prefixDown[x + 1] = (prefixDown[x] + dpDown[i][x]) % MOD;
            }

            for (int y = 0; y < m; y++) {
                // Transition for dir = 1 (need up → next must be greater)
                dpDown[i + 1][y] = prefixUp[y];

                // Transition for dir = 0 (need down → next must be smaller)
                dpUp[i + 1][y] = (prefixDown[m] - prefixDown[y + 1] + MOD) % MOD;
            }
        }

        long ans = 0;
        for (int x = 0; x < m; x++) {
            ans = (ans + dpUp[n][x] + dpDown[n][x]) % MOD;
        }
        return (int) ans;
    }
}
