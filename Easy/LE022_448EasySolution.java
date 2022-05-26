package Easy;

import java.util.ArrayList;
import java.util.List;

public class LE022_448EasySolution {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i< nums.length){
//            We need not consider 0 as nums[i] is starting from 1 only for the limits.(n<= nums.length)
            if(nums[i] <= nums.length && nums[i] != i+1 && nums[i] != nums[nums[i]-1]){
                swap(nums,i,nums[i] -1);
            }else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] > nums.length || nums[j] != j+1){
                list.add(j+1);
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
        int [] nums = {4,3,2,7,3,2,3,1};
        for(int num : findDisappearedNumbers(nums)){
            System.out.println(num);
        }
    }
}
