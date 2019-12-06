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
	
//	public int rob(int[] nums){
//		if(nums.length == 0){
//			return 0;
//		}
//		
//		int currentMax = 0;
//		int previousMax = 0;
//		
//		// Starting from first element, keep track of the max
//		for(int num : nums){
//			int temp = currentMax;
//			currentMax = Math.max(previousMax + num, currentMax);
//			previousMax = temp;
//		}
//		
//		return currentMax;
//	}
	
	// Dynamic programming solution, easy to understand
    public int rob(int[] nums){
    	// Cases that could be return right away
        if(nums.length == 0){ // Return 0 if empty
        	return 0;
        } else if (nums.length == 1){ // If one element
        	return nums[0];
        } else if (nums.length == 2){ // If two element, compare both
        	return Math.max(nums[0], nums[1]);
        }

        // Bottom up approach with dynamic programming
        int[] dp = new int[nums.length];
        
        // Set up some default value like index 0, mostly 0
        dp[0] = nums[0];
        
        // index 1 will be the max of element 0 or element 1, since we want to see which one is bigger
        dp[1] = Math.max(nums[0], nums[1]);
        
        // Starting from 2, compare the previous dp element with current element and previous previous dp element
        for(int i = 2; i < nums.length; i++){
        	dp[i] = Math.max(dp[i - 1], nums[i] + dp[i-2]);
        }
        
        // Returning the last value of the dp array
        return dp[nums.length - 1];
        
    }
}
