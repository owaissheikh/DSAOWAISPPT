package ArrayAssigment2;

// Question 7
// An array is monotonic if it is either monotone increasing or monotone decreasing.

// An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is
// monotone decreasing if for all i <= j, nums[i] >= nums[j].

// Given an integer array nums, return true if the given array is monotonic, or false otherwise.

// Example 1:
// Input: nums = [1,2,2,3]
// Output: true
public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        // Check if the array is monotone increasing or monotone decreasing
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                increasing = false;
            }
            if (nums[i] > nums[i - 1]) {
                decreasing = false;
            }
        }

        // Return true if the array is either monotone increasing or monotone decreasing
        return increasing || decreasing;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};
        MonotonicArray solution = new MonotonicArray();
        boolean isMonotonic = solution.isMonotonic(nums);
        System.out.println("Is the array monotonic? " + isMonotonic);
    }
}

