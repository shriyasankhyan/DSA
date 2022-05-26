package Easy;

public class LE030_645 {
    public static void main(String[] args) {
        int [] nums = {3,2,2};
        for(int num : findErrorNums(nums)){
            System.out.println(num);
        }
    }
    public static int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int index = 0;
        while (index < nums.length) {
            if(nums[index] != nums[nums[index]-1] && nums[index] != index+1){
                swap(nums , index , nums[index] -1);
            }
            else{
                index++;
            }
        }
            int i = 0;
        while(i < nums.length){
            if(nums[i] != i+1){
                ans[0] = nums[i];
                ans[1] = i+1;
                break;
            }else{
                i++;
            }
        }
        return ans;
    }
    public static void swap(int [] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
