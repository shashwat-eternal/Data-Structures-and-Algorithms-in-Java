import java.util.*;

class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<int[]> points = new ArrayList<>();
        for (int[] b : buildings) {
            points.add(new int[]{b[0], -b[2]}); // start point
            points.add(new int[]{b[1], b[2]});  // end point
        }
        points.sort((a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });

        List<List<Integer>> result = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(0);
        int prevHeight = 0;

        for (int[] p : points) {
            if (p[1] < 0) {
                pq.add(-p[1]); // entering building
            } else {
                pq.remove(p[1]); // leaving building
            }
            int currHeight = pq.peek();
            if (currHeight != prevHeight) {
                result.add(Arrays.asList(p[0], currHeight));
                prevHeight = currHeight;
            }
        }
        return result;
    }
}
