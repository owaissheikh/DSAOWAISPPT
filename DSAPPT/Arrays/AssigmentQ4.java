import java.util.Arrays;
// // <aside>
// 💡 **Q4.** You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

// Increment the large integer by one and return the resulting array of digits.

// **Example 1:**
// Input: digits = [1,2,3]
// Output: [1,2,4]

// **Explanation:** The array represents the integer 123.

// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].

// </aside>

public class AssigmentQ4 {
    public static int[] result(int[] nums){

        for(int i=0; i<nums.length; i++){
            if(nums[i]==nums.length){
                nums[i]++;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int digits[] = {1,2,3};
        int r[] = result(digits);

        System.out.println(Arrays.toString(r));
    }
}
