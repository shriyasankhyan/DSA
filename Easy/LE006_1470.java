package Easy;

public class LE006_1470 {
    public static void main(String[] args) {
        int [] nums = {2,5,1,3,4,7};
        int [] ans = shuffle(nums,nums.length/2);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(ans[i]);
        }
    }
    public static int[] shuffle(int[] nums, int n) {
        int [] ans = new int[nums.length];
        for (int i = 0; i < nums.length ;i+=2) {
            ans[i] = nums[i/2];
        }
        for (int i = 1; i < nums.length; i+=2) {
            ans[i] = nums[n +(i/2)];
        }
        return ans;
    }
}

