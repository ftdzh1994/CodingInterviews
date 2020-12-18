class Solution {
    public int numWays(int n) {
        if (n < 0) return -1;
        if (n <= 1) return 1;
        int a = 1, b = 1, ans = 0;
        for (int i = 2; i <= n; i++) {
            ans = (a + b) % 1000000007;
            a = b;
            b = ans;
        }
        return ans;
    }
}