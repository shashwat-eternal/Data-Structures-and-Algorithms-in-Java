class Solution {
    public int longestSubsequence(int[] nums) {
        int xorAll = 0;
        for (int num : nums) {
            xorAll ^= num;
        }
        
        if (xorAll != 0) {
            return nums.length;
        }
        
        for (int num : nums) {
            if ((xorAll ^ num) != 0) {
                return nums.length - 1;
            }
        }
        
        return 0;
    }
}
