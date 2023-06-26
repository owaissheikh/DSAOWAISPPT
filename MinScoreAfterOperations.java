package ArrayAssigment2;

import java.util.Arrays;
// Question 8
// You are given an integer array nums and an integer k.

// In one operation, you can choose any index i where 0 <= i < nums.length and change nums[i] to nums[i] + x where x is an integer from the range [-k, k]. You can apply this operation at most once for each index i.

// The score of nums is the difference between the maximum and minimum elements in nums.

// Return the minimum score of nums after applying the mentioned operation at most once for each index in it.

// Example 1:
// Input: nums = [1], k = 0
// Output: 0

// Explanation: The score is max(nums) - min(nums) = 1 - 1 = 0.
public class MinScoreAfterOperations {
    public int minScore(int[] nums, int k) {
        int n = nums.length;

        // Sort the array in ascending order
        Arrays.sort(nums);

        // Set the initial minimum and maximum values
        int minVal = nums[0];
        int maxVal = nums[n - 1];

        // Initialize the result with the initial score
        int result = maxVal - minVal;

        // Iterate from the second smallest value to the second largest value
        for (int i = 1; i < n - 1; i++) {
            int minValue = nums[i] - k;
            int maxValue = nums[i] + k;

            // Check if the updated minimum and maximum values can yield a smaller score
            if (minValue > minVal || maxValue < maxVal) {
                result = Math.min(result, maxValue - minValue);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        MinScoreAfterOperations solution = new MinScoreAfterOperations();
        int minScore = solution.minScore(nums, k);
        System.out.println("Minimum score: " + minScore);
    }
}

