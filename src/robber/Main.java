package robber;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {2,1,1,2};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		FindMaximumMoneyRobFunction solution = new FindMaximumMoneyRobFunction();
		
		System.out.println("Solution: " + solution.rob1(nums));
	}
}
