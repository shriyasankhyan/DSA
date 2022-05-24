package Easy;

import java.util.Arrays;

public class LE023_977A {
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int [] nums = {-4,-1,0,3,10};
        for (int element : sortedSquares(nums)) {
            System.out.println(element);
        }
    }
}
