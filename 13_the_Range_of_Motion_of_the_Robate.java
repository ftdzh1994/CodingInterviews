class Solution {
    int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    int maxR;
    int maxC;

    public int movingCount(int m, int n, int k) {
        int[][] visited = new int [m][n];
        maxR = m;
        maxC = n;
        int ans = visit(0, 0, k, visited);
        return ans;
    }

    public int visit(int i, int j, int k, int[][] visited) {
        if (visited[i][j] != 0) {
            return 0;
        }
        if (getDigitSum(i) + getDigitSum(j) > k) {
            visited[i][j] = -1;
            return 0;
        }
        visited[i][j] = 1;
        int cnt = 1;
        for (int[] dir : directions) {
            int newi = i + dir[0], newj = j + dir[1];
            if (0 <= newi && newi < maxR && 0 <= newj && newj < maxC && visited[newi][newj] == 0) {
                cnt += visit(newi, newj, k, visited);
            }
        }
        return cnt;
    }

    public int getDigitSum(int d) {
        int sum = 0;
        while (d != 0) {
            sum += d % 10;
            d = d / 10;
        }
        return sum;
    }
}