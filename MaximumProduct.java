package ArrayAssigment2;

import java.util.Arrays;

// Question 5
// Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

// Example 1:
// Input: nums = [1,2,3]
// Output: 6

public class MaximumProduct {
    public int maximumProduct(int[] nums) {
        // Sort the array in ascending order
        Arrays.sort(nums);

        int n = nums.length;

        // Calculate the maximum product of three numbers
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        // Calculate the maximum product considering negative numbers
        int product2 = nums[0] * nums[1] * nums[n - 1];

        // Return the maximum of the two products
        return Math.max(product1, product2);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        MaximumProduct solution = new MaximumProduct();
        int maxProduct = solution.maximumProduct(nums);
        System.out.println("Maximum product: " + maxProduct);
    }
}

