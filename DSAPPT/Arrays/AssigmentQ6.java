import java.util.Arrays;
public class AssigmentQ6 {
    public static boolean found(int nums[]) {
        int count = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    break;
                }
            }
            
            if (count > 1) {
                return true;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1};
        boolean result = found(nums);
        System.out.println(result);
    }
}
