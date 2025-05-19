class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;
        int max = 0;
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (grid[r][c] == 1) {
                    max = Math.max(max, bfs(grid, r, c));
                }
            }
        }
        return max;
    }

    private int[][] dirs = new int[][] {
            { 0, 1 },
            { 0, -1 },
            { 1, 0 },
            { -1, 0 },
    };

    private int bfs(int[][] grid, int r, int c) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { r, c });
        grid[r][c]=0;
        int area = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int p[] = q.remove();
                area++;
                for (int d[] : dirs) {
                    int nr = p[0] + d[0];
                    int nc = p[1] + d[1];
                    if (nr >= 0 && nc >= 0 && nr < grid.length && nc < grid[0].length && grid[nr][nc] == 1) {
                        q.add(new int[] { nr, nc });
                        grid[nr][nc]=0;
                    }
                }

            }
        }
        return area;
    }
}