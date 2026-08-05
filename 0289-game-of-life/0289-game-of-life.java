class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int liveNeighbors = countLive(board, i, j, m, n);

                
                if (board[i][j] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    board[i][j] = -1;
                }
               
                if (board[i][j] == 0 && liveNeighbors == 3) {
                    board[i][j] = 2; 
                }
            }
        }

        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == -1) board[i][j] = 0;
                else if (board[i][j] == 2) board[i][j] = 1;
            }
        }
    }

    private int countLive(int[][] board, int row, int col, int m, int n) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue;
                int r = row + i, c = col + j;
                if (r >= 0 && r < m && c >= 0 && c < n) {
                    if (board[r][c] == 1 || board[r][c] == -1) count++;
                }
            }
        }
        return count;
    }
}
