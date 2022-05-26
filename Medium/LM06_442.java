package Medium;
import java.util.List;
import java.util.ArrayList;
public class LM06_442 {
//    Each number is either once or twice and list can be in any order. If answer is [3,2] not [2,3], it works.(list)
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
            if(nums[i] != i+1 && nums[i] != nums[nums[i]-1]  ){
                swap(nums , i, nums[i] -1);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                list.add(nums[j]);
            }
        }

        return list;
    }

    public static void swap(int [] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
        for(int num : findDuplicates(nums)){
            System.out.println(num);
        }
    }
}

