class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1 || grid[grid.length - 1][grid[0].length - 1] == 1) {
            return -1;
        }
        if (grid.length == 1 && grid[0].length == 1) {
            return 1;
        }
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { 0, 0 });
        grid[0][0] = 1;
        int res = 1;
        int[][] dirs = new int[][] {
                { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 },
                { 1, 1 }, { 1, -1 }, { -1, 1 }, { -1, -1 },
        };
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int[] cell = q.remove();
                int r = cell[0];
                int c = cell[1];
                if (r == grid.length - 1 && c == grid[0].length - 1) {
                    return res;
                }
                for (int[] d : dirs) {
                    int nr = r + d[0];
                    int nc = c + d[1];
                    if (nr >= 0 && nc >= 0 && nr < grid.length && nc < grid[0].length && grid[nr][nc] == 0) {
                        q.add(new int[] { nr, nc });
                        grid[nr][nc] = 1;
                    }
                }
            }

            res++;
        }
        return -1;

    }
}