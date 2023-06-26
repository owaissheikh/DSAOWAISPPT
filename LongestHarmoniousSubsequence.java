package ArrayAssigment2;

import java.util.HashMap;
import java.util.Map;

// Question 3
// We define a harmonious array as an array where the difference between its maximum value
// and its minimum value is exactly 1.

// Given an integer array nums, return the length of its longest harmonious subsequence
// among all its possible subsequences.

// A subsequence of an array is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements.

// Example 1:
// Input: nums = [1,3,2,2,5,2,3,7]
// Output: 5

// Explanation: The longest harmonious subsequence is [3,2,2,2,3].

public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        // Create a frequency map to count the occurrences of each number
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Populate the frequency map
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int longestSubsequence = 0;

        // Iterate over the numbers in the array
        for (int num : nums) {
            // Check if there is a number in the map that differs from the current number by 1
            if (freqMap.containsKey(num + 1)) {
                int currentLength = freqMap.get(num) + freqMap.get(num + 1);
                longestSubsequence = Math.max(longestSubsequence, currentLength);
            }
        }

        return longestSubsequence;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        LongestHarmoniousSubsequence solution = new LongestHarmoniousSubsequence();
        int longestSubsequence = solution.findLHS(nums);
        System.out.println("Length of the longest harmonious subsequence: " + longestSubsequence);
    }
}

