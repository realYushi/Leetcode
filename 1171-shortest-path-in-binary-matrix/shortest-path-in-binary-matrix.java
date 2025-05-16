class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]==1){
            return -1;
        }
        int n = grid.length;
        if(n==1){
            return 1;
        }
        Queue<int[]> q = new LinkedList<>();
        int length = 1;
        q.add(new int[] { 0, 0 });
        int[][] dirs = new int[][] {
                { 0, 1 },
                { 0, -1 },
                { 1, 0 },
                { -1, 0 },
                { 1, 1 },
                { 1, -1 },
                { -1, 1 },
                { -1, -1 },
        };
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int[] p = q.remove();
                if (p[0] == n - 1 && p[1] == n - 1) {
                    return length;
                }
                for (int[] dir : dirs) {
                    int nr = p[0] + dir[0];
                    int nc = p[1] + dir[1];
                    if (nr < 0 || nc < 0 || nr >= n || nc >= n || grid[nr][nc] == 1 ) {
                        continue;
                    }
                    grid[nr][nc] = 1;
                    q.add(new int[] { nr, nc });
                }
            }
            length++;
        }

        return -1;
    }
}