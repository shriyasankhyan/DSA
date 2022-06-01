package Easy;

public class LE003_1480A {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        runningSum(nums);
        for (int i = 0; i < nums.length ; i++) {
            System.out.println(nums[i]);
        }
    }
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}
