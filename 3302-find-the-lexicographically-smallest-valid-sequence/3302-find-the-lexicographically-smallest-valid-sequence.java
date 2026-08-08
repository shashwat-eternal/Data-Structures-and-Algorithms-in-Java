class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        int[] res = new int[m];
        
        
        int[] dp = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = dp[i + 1];
            if (dp[i + 1] < m && word1.charAt(i) == word2.charAt(m - dp[i + 1] - 1)) {
                dp[i] = dp[i + 1] + 1;
            }
        }
        
        int j = 0; 
        boolean usedMismatch = false;
        for (int i = 0; i < n && j < m; i++) {
            if (word1.charAt(i) == word2.charAt(j)) {
                res[j++] = i;
            } else if (!usedMismatch) {
                
                if (dp[i + 1] >= m - j - 1) {
                    res[j++] = i;
                    usedMismatch = true;
                }
            }
        }
        
        if (j < m) return new int[0]; 
        return res;
    }
}
