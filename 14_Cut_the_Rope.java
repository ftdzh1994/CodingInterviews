class Solution {
    public int cuttingRope(int n) {
        int[] a = new int[60];
        a[2] = 1;
        a[3] = 2;
        a[4] = 4;
        a[5] = 2 * 3;
        a[6] = 3 * 3;
        for (int i = 7; i <=n; i++) {
            a[i] = a[i - 3] * 3;
        }
        return a[n];
    }
}