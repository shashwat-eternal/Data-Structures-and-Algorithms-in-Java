import java.util.*;

class Solution {
    public int minMoves(String[] classroom, int energy) {
        int m = classroom.length;
        int n = classroom[0].length();

        int sr = -1, sc = -1;
        int litterCount = 0;

        // Find start and count litter
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char c = classroom[i].charAt(j);

                if (c == 'S') {
                    sr = i;
                    sc = j;
                } else if (c == 'L') {
                    litterCount++;
                }
            }
        }

        if (litterCount == 0) {
            return 0;
        }

        int fullMask = (1 << litterCount) - 1;

        // Give every litter an index
        int[][] litterId = new int[m][n];

        for (int[] row : litterId) {
            Arrays.fill(row, -1);
        }

        int id = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (classroom[i].charAt(j) == 'L') {
                    litterId[i][j] = id++;
                }
            }
        }

        /*
         * best[mask][cell] = maximum energy with which
         * we have reached this cell after collecting mask.
         *
         * If we reach the same cell with the same mask
         * but less/equal energy, that state is useless.
         */
        int cells = m * n;
        int[][] best = new int[1 << litterCount][cells];

        for (int[] row : best) {
            Arrays.fill(row, -1);
        }

        Queue<State> q = new ArrayDeque<>();

        int startCell = sr * n + sc;

        best[0][startCell] = energy;
        q.offer(new State(sr, sc, energy, 0, 0));

        int[][] dirs = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
        };

        while (!q.isEmpty()) {
            State cur = q.poll();

            int r = cur.r;
            int c = cur.c;
            int e = cur.energy;
            int mask = cur.mask;
            int moves = cur.moves;

            if (mask == fullMask) {
                return moves;
            }

            // Ignore an outdated state
            if (e < best[mask][r * n + c]) {
                continue;
            }

            // No energy means we cannot move.
            if (e == 0) {
                continue;
            }

            for (int[] dir : dirs) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                    continue;
                }

                if (classroom[nr].charAt(nc) == 'X') {
                    continue;
                }

                int ne = e - 1;
                int nmask = mask;

                char cell = classroom[nr].charAt(nc);

                // Collect litter
                if (cell == 'L') {
                    int litter = litterId[nr][nc];
                    nmask |= (1 << litter);
                }

                // Recharge at R
                if (cell == 'R') {
                    ne = energy;
                }

                int cellId = nr * n + nc;

                /*
                 * We only need this state if we arrive
                 * with more energy than before.
                 */
                if (ne <= best[nmask][cellId]) {
                    continue;
                }

                best[nmask][cellId] = ne;

                q.offer(
                    new State(
                        nr,
                        nc,
                        ne,
                        nmask,
                        moves + 1
                    )
                );
            }
        }

        return -1;
    }

    static class State {
        int r;
        int c;
        int energy;
        int mask;
        int moves;

        State(int r, int c, int energy, int mask, int moves) {
            this.r = r;
            this.c = c;
            this.energy = energy;
            this.mask = mask;
            this.moves = moves;
        }
    }
}