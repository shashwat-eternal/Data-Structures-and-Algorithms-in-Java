class Solution {
    static final int MOD = 1000000007;

    // Matrix multiplication
    private long[][] multiply(long[][] A, long[][] B) {
        int n = A.length;
        int m = B[0].length;
        int p = B.length;
        long[][] C = new long[n][m];
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < p; k++) {
                if (A[i][k] == 0) continue;
                for (int j = 0; j < m; j++) {
                    C[i][j] = (C[i][j] + A[i][k] * B[k][j]) % MOD;
                }
            }
        }
        return C;
    }

    // Fast exponentiation of matrix
    private long[][] power(long[][] A, long exp) {
        int n = A.length;
        long[][] res = new long[n][n];
        for (int i = 0; i < n; i++) res[i][i] = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) res = multiply(res, A);
            A = multiply(A, A);
            exp >>= 1;
        }
        return res;
    }

    public int zigZagArrays(int n, int l, int r) {
        int m = r - l + 1;
        int size = 2 * m;
        long[][] T = new long[size][size];

        // Build transition matrix
        for (int x = 0; x < m; x++) {
            // up,x → down,y for y > x
            for (int y = x + 1; y < m; y++) {
                T[m + x][y] = 1;
            }
            // down,x → up,y for y < x
            for (int y = 0; y < x; y++) {
                T[x][m + y] = 1;
            }
        }

        // Initial vector: all ones
        long[][] init = new long[size][1];
        for (int i = 0; i < size; i++) init[i][0] = 1;

        // Compute T^(n-1)
        long[][] Texp = power(T, n - 1);

        // Multiply T^(n-1) * init
        long[][] finalVec = multiply(Texp, init);

        // Sum entries
        long ans = 0;
        for (int i = 0; i < size; i++) {
            ans = (ans + finalVec[i][0]) % MOD;
        }
        return (int) ans;
    }
}
