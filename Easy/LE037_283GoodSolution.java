package Easy;

public class LE037_283GoodSolution {
    public static void moveZeroes(int[] nums) {
//        k is the record of 1st non zero integer.
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){

            }
            else{
                nums[k] = nums[i];
                k++;
            }
        }
//        After all 0s are over, mark the numbers left as zero.
        while (k< nums.length){
            nums[k] = 0;
            k++;
        }
    }

    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
}
