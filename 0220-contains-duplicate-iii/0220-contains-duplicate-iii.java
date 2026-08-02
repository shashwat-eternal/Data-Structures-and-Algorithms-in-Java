import java.util.TreeSet;

class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            long num = nums[i];

            // Find the smallest number >= num - valueDiff
            Long candidate = set.ceiling(num - (long) valueDiff);
            if (candidate != null && candidate <= num + (long) valueDiff) {
                return true;
            }

            set.add(num);

            // Maintain sliding window of size indexDiff
            if (i >= indexDiff) {
                set.remove((long) nums[i - indexDiff]);
            }
        }
        return false;
    }
}
