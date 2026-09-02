import java.util.*;

class Solution {
    public int minMoves(String[] classroom, int energy) {
        int m = classroom.length, n = classroom[0].length();
        int sx = -1, sy = -1;
        List<int[]> litter = new ArrayList<>();
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char c = classroom[i].charAt(j);
                if (c == 'S') { sx = i; sy = j; }
                if (c == 'L') litter.add(new int[]{i, j});
            }
        }
        
        int fullMask = (1 << litter.size()) - 1;
        Queue<int[]> q = new LinkedList<>();
        Map<String, Integer> bestEnergy = new HashMap<>();
        
        q.offer(new int[]{sx, sy, 0, energy, 0});
        bestEnergy.put(key(sx, sy, 0), energy);
        
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1], mask = cur[2], e = cur[3], steps = cur[4];
            
            if (mask == fullMask) return steps;
            
            for (int[] d : dirs) {
                int nx = x + d[0], ny = y + d[1];
                if (nx < 0 || ny < 0 || nx >= m || ny >= n) continue;
                char c = classroom[nx].charAt(ny);
                if (c == 'X') continue;
                
                int ne = e - 1;
                if (ne < 0) continue;
                if (c == 'R') ne = energy;
                
                int nmask = mask;
                for (int k = 0; k < litter.size(); k++) {
                    if (nx == litter.get(k)[0] && ny == litter.get(k)[1]) {
                        nmask |= (1 << k);
                    }
                }
                
                String key = key(nx, ny, nmask);
                if (bestEnergy.getOrDefault(key, -1) >= ne) continue;
                bestEnergy.put(key, ne);
                q.offer(new int[]{nx, ny, nmask, ne, steps + 1});
            }
        }
        
        return -1;
    }
    
    private String key(int x, int y, int mask) {
        return x + "," + y + "," + mask;
    }
}
