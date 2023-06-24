import java.util.Arrays;
// <aside>
// 💡 **Q7.** Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements.

// Note that you must do this in-place without making a copy of the array.

// **Example 1:**
// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]

// </aside>
public class AssigmentQ7 {
    public static int[] endZeroPlace(int nums[]){
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }

        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }

        return nums;
    }
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        int result[] = endZeroPlace(nums);
        System.out.println(Arrays.toString(result));
    }
}
