class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean hasEven = false, hasOdd = false;
        int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;

        for (int num : nums1) {
            if (num % 2 == 0) {
                hasEven = true;
                minEven = Math.min(minEven, num);
            } else {
                hasOdd = true;
                minOdd = Math.min(minOdd, num);
            }
        }

        
        if (!hasEven || !hasOdd) {
            return true;
        }


        return minOdd < minEven;
    }
}