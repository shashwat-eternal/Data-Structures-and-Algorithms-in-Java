class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        
        if (n <= 1) {
            return result;
        }
        
        int min = nums[0];
        int max = nums[0];
        Set<Integer> numSet = new HashSet<>();
        
       
        for (int i = 0; i < n; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
            numSet.add(nums[i]);
        }
        
       
        for (int i = min + 1; i < max; i++) {
            if (!numSet.contains(i)) {
                result.add(i);
            }
        }
        
        return result;
    }
}