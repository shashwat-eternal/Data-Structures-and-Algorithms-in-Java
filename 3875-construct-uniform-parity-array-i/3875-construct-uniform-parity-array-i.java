class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int parity = nums1[0] % 2;
        for (int i = 1; i < n; i++) {
            if (nums1[i] % 2 != parity) {
                return true;
            }
        }
        return true;
    }
}
