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

	// Using iterative way with memo as to track the max from bottom-top
	// public int rob(int[] nums) {
	// if(nums.length == 0){
	// return 0;
	// }

	// // This will keep track of maximum profit
	// int[] memo = new int[nums.length + 1];

	// // Store 0 since if its 1,2 then there is a zero in front of 1
	// memo[0] = 0;
	// memo[1] = nums[0];

	// // Start from 1 to nums.length
	// for(int i = 1; i < nums.length; i++){
	// // Store the next max value into memo[i + 1]
	// memo[i + 1] = Math.max(memo[i], memo[i - 1] + nums[i]);
	// }

	// // The last element of memo will be the max profit
	// return memo[nums.length];
	// }
	
	public int rob(int[] nums){
		if(nums.length == 0){
			return 0;
		}
		
		int currentMax = 0;
		int previousMax = 0;
		
		// Starting from first element, keep track of the max
		for(int num : nums){
			int temp = currentMax;
			currentMax = Math.max(previousMax + num, currentMax);
			previousMax = temp;
		}
		
		return currentMax;
	}
}
