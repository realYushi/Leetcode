class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int row = grid.length - 1;
        int col = grid[0].length - 1;
        if (grid[0][0] == 1 || grid[row][col] == 1) {
            return -1;
        }
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { 0, 0 });
        int res = 1;
        int[][] dirs = new int[][] {
                { 0, 1 }, { 1, 0 }, { 0, -1 },{-1,0},
                { 1, 1 }, { -1, -1 }, { 1, -1 },{-1,1},
        };
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int[] p = q.remove();
                if (p[0] == row && p[1] == col) {
                    return res;
                }
                for (int[] d : dirs) {
                    int nr = p[0] + d[0];
                    int nc = p[1] + d[1];
                    if (nr >= 0 && nc >= 0 && nr < grid.length && nc < grid[0].length && grid[nr][nc] == 0) {
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