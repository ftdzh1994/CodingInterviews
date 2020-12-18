class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        boolean flag = false;
        long b = n;
        if (b < 0) {
            flag = true;
            b = -b;             // When convert NEG-INF to POS-INF, it will exceed the mod.
        }
        double res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = res * x;
            }
            x = x * x;
            b /= 2;
        }
        if (flag) return 1.0/res;
        return res;
    }
}