class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int n = s.length();
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        StringBuilder ans = new StringBuilder();
        if (dfs(0, target, freq, ans, true)) {
            return ans.toString();
        }
        return "";
    }

    private boolean dfs(int pos, String target, int[] freq, StringBuilder ans, boolean tight) {
        if (pos == target.length()) return !tight;
        int start = tight ? target.charAt(pos) - 'a' : 0;
        for (int ch = start; ch < 26; ch++) {
            if (freq[ch] == 0) continue;
            freq[ch]--;
            ans.append((char) (ch + 'a'));
            boolean newTight = tight && (ch == target.charAt(pos) - 'a');
            if (dfs(pos + 1, target, freq, ans, newTight)) return true;
            ans.deleteCharAt(ans.length() - 1);
            freq[ch]++;
        }
        return false;
    }
}
