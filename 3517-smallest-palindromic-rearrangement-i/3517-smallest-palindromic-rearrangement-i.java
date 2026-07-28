class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int oddCount = 0;
        int oddCharIndex = -1;
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) {
                oddCount++;
                oddCharIndex = i;
            }
        }

        if (oddCount > 1) return "";

        StringBuilder left = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < freq[i] / 2; j++) {
                left.append((char) (i + 'a'));
            }
        }

        StringBuilder right = new StringBuilder(left).reverse();
        String middle = oddCharIndex == -1 ? "" : String.valueOf((char) (oddCharIndex + 'a'));

        return left.toString() + middle + right.toString();
    }
}
