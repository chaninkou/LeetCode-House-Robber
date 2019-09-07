package robber;

public class FindMaximumMoneyRobFunction {
	// Recursion stack which will cause time limit exceeded
	// public int rob(int[] nums) {
	// return rob(nums, nums.length - 1);
	// }
	// private int rob(int[] nums, int i){
	// // Base, return 0 when it is negative
	// if(i < 0){
	// return 0;
	// }

	// return Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
	// }

	// int[] memo;
	// public int rob(int[] nums){
	// memo = new int[nums.length + 1];
	// Arrays.fill(memo, -1);
	// return rob(nums, nums.length - 1);
	// }

	// private int rob(int[] nums, int i){
	// if(i < 0){
	// return 0;
	// }

	// if(memo[i] >= 0){
	// return memo[i];
	// }

	// int result = Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));

	// memo[i] = result;

	// return result;
	// }

	public int rob(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		int prev1 = 0;
		int prev2 = 0;

		for (int num : nums) {
			int tmp = prev1;
			prev1 = Math.max(prev2 + num, prev1);
			prev2 = tmp;
		}

		return prev1;
	}
}
