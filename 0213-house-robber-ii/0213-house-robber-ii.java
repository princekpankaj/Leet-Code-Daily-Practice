class Solution {

    public int MaxSum(int in, int[] nums, int[] memo, int start) {
        if (in == start) return nums[in];
        if (in < start) return 0;

        if (memo[in] != -1) return memo[in];

        int pick = nums[in] + MaxSum(in - 2, nums, memo, start);
        int notPick = MaxSum(in - 1, nums, memo, start);

        memo[in] = Math.max(pick, notPick);
        return memo[in];
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        int[] memo1 = new int[n];
        int[] memo2 = new int[n];

        for (int i = 0; i < n; i++) {
            memo1[i] = -1;
            memo2[i] = -1;
        }

        int ans1 = MaxSum(n -2, nums, memo1,0); 
        int ans2 = MaxSum(n -1, nums, memo2, 1);

        return Math.max(ans1, ans2);
    }
}
