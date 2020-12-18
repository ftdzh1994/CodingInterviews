class Solution {
    public int fib(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        int res = 0, fib0 = 0, fib1 = 1;
        for (int i = 2; i <= n; i++) {
            res = (fib0 + fib1) % 1000000007 ;
            fib0 = fib1;
            fib1 = res;
        }
        return res ;
    }
}