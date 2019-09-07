package robber;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {2, 7, 9, 3, 1};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		FindMaximumMoneyRobFunction solution = new FindMaximumMoneyRobFunction();
		
		System.out.println("Solution: " + solution.rob(nums));
	}
}
