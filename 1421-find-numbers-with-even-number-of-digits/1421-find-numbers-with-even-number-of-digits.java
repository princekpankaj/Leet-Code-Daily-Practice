class Solution {
    public boolean isEven(int n) {
        int digits = 0;
        while (n > 0) {
            n /= 10;
            digits++;
        }
        return digits % 2 == 0;
    }
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (isEven(i)) {
                count++;
            }
        }
        return count;
    }

}