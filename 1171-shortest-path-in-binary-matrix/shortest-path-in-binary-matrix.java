class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1) {
            return -1;
        }
        if (grid.length == 1 && grid[0].length == 1) {
            return 1;
        }
        int ROWS = grid.length;
        int COLS = grid[0].length;
        if (grid[ROWS - 1][COLS - 1] == 1) {
            return -1;
        }
        int res = 1;
        int[][] dirs = new int[][] {
                { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 },
                { 1, 1 }, { 1, -1 }, { -1, 1 }, { -1, -1 },
        };
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { 0, 0 });
        grid[0][0] = 1;
        while (!q.isEmpty()) {
            int len = q.size();
           
            for (int i = 0; i < len; i++) {
                 int[] p = q.remove();
            if (p[0] == ROWS - 1 && p[1] == COLS - 1) {
                return res;
            }
                for (int[] d : dirs) {
                    int nr = p[0] + d[0];
                    int nc = p[1] + d[1];
                    if (nr >= 0 && nc >= 0 && nr < ROWS && nc < COLS && grid[nr][nc] == 0) {
                        grid[nr][nc] = 1;
                        q.add(new int[] { nr, nc });
                    }
                }
            }

            res++;
        }
        return -1;

    }
}