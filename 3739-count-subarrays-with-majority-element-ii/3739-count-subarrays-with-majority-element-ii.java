import java.util.*;

class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (nums[i] == target) ? 1 : -1;
        }
        long[] pref = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            pref[i] = pref[i - 1] + arr[i - 1];
        }
        long[] sorted = pref.clone();
        Arrays.sort(sorted);
        Map<Long, Integer> comp = new HashMap<>();
        int idx = 1;
        for (long v : sorted) {
            if (!comp.containsKey(v)) {
                comp.put(v, idx++);
            }
        }
        Fenwick fenwick = new Fenwick(idx + 2);
        long ans = 0;
        for (int i = 0; i <= n; i++) {
            int pos = comp.get(pref[i]);
            ans += fenwick.query(pos - 1);
            fenwick.update(pos, 1);
        }
        return ans;
    }
    static class Fenwick {
        long[] bit;
        Fenwick(int n) {
            bit = new long[n + 1];
        }
        void update(int i, long val) {
            while (i < bit.length) {
                bit[i] += val;
                i += i & -i;
            }
        }
        long query(int i) {
            long sum = 0;
            while (i > 0) {
                sum += bit[i];
                i -= i & -i;
            }
            return sum;
        }
    }
}
