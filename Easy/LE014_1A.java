package Easy;

public class LE014_1A {
    public static void main(String[] args) {
        int []nums = {2,7,11,25,-345,-35};
        int target = 9;
        int [] ans = twoSum(nums,target);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int [] {0,0};
    }
}
