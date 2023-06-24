// <aside>
// 💡 **Q3.** Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

// **Example 1:**
// Input: nums = [1,3,5,6], target = 5

// Output: 2

// </aside>

public class AssigmentQ3 {
    public static int finTarget(int nums[],int target){
        int index =0;
        int endIndex =0;
        for(int i=0; i<nums.length; i++){
            endIndex = i;
            if(nums[i]==target){
                index = i;
                return index;
            }
        }
        return endIndex;
    }
    public static void main(String[] args) {
       int[]nums = {1,3,5,6};
       int target = 5;
        int result = finTarget(nums,target);
        System.out.println(result);
    }
}
