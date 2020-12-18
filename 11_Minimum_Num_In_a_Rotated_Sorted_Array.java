class Solution {
    public int minArray(int[] numbers) {
        int l = 0, r = numbers.length - 1;
        while (l < r) {
            int mid = (l + r) >> 1;
            if (numbers[mid] == numbers[r]) {
                r = r - 1;
            } else if (numbers[mid] < numbers[r]) {
                r = mid;
            } else if (numbers[mid] > numbers[r]) {
                l = mid + 1;
            }
        }
        return numbers[l];
    }
}