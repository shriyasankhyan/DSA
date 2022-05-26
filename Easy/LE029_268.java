package Easy;

public class LE029_268 {
    public static void main(String[] args) {
        int [] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] < nums.length && nums[i] != i){
                swap(nums,i,nums[i]);
            }else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] >= nums.length || nums[j] != j ){
                return j;
            }
        }
        return nums.length;
    }
    public static void swap(int [] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
