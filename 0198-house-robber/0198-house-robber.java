class Solution {

    public int MaxSum(int in, int[] nums, int[] memo) {
        if (in == 0) return nums[in];
        if (in < 0) return 0;

        if (memo[in] != -1) return memo[in];

        int pick = nums[in] + MaxSum(in - 2, nums, memo);
        int notPick = MaxSum(in - 1, nums, memo);

        memo[in] = Math.max(pick, notPick);
        return memo[in];
    }

    public int rob(int[] nums) {
        int[] memo = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            memo[i] = -1;
        }
        return MaxSum(nums.length - 1, nums, memo);
    }
}
