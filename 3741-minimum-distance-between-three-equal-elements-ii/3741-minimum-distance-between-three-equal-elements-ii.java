class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer, int[]> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new int[]{i, i, 1});
            } else {
                int[] a = map.get(nums[i]);
                
                if (a[2] >= 2) {
                    ans = Math.min(ans, 2 * (i - a[0]));
                }
                
                a[0] = a[1];
                a[1] = i;
                a[2]++;
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}