package Easy;

public class LE002_1929 {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        for (int i = 0; i < 2*nums.length; i++) {
            System.out.println(getConcatenation(nums)[i]);
        }
    }
    public static int[] getConcatenation(int[] nums) {
        int [] ans = new int[2*nums.length];
        for (int i = 0; i < 2*nums.length; i++) {
            if(i< nums.length){
                ans[i] = nums[i];
            }
            if(i >= nums.length){
                ans[i] = nums[i-nums.length];
            }
        }
        return ans;
    }
}
