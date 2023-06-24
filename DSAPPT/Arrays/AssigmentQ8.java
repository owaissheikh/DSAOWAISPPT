// <aside>
// 💡 **Q8.** You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

// You are given an integer array nums representing the data status of this set after the error.

// Find the number that occurs twice and the number that is missing and return them in the form of an array.

// **Example 1:**
// Input: nums = [1,2,2,4]
// Output: [2,3]

// </aside>
import java.util.Arrays;

public class AssigmentQ8 {

        public static int[] findErrorNumbers(int[] nums) {
        int[] result = new int[2];
        int n = nums.length;
        int[] count = new int[n + 1];

        // Count the occurrences of each number
        // Count the occurrences of each number
        for (int i = 0; i < n; i++) {
            count[nums[i]]++;
        }
        

        // Find the number that occurs twice
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                result[0] = i;
                break;
            }
        }

        // Find the missing number
        for (int i = 1; i <= n; i++) {
            if (count[i] == 0) {
                result[1] = i;
                break;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,2,4};
        // int result[] = repeatingDuplicate(nums);
        int r[] = findErrorNumbers(nums);
        System.out.println(Arrays.toString(r));
    }
}
