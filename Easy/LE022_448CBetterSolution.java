package Easy;

import java.util.ArrayList;
import java.util.List;

public class LE022_448CBetterSolution {
//    Since all the numbers are positive. So if we want to mark presence of any number, we can do it by making it a
//    negative number
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int index  = -1;
//        We are going to iterate over the array.
        for (int i = 0; i < nums.length; i++) {
//            index of the nums[i] number will be -1 to that to nums[i]. But since we are marking numbers negative,
//            we need Math.abs
                index = Math.abs(nums[i]) - 1;
//            }
//            We will mark the positive number negative if it is not already marked negative.
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
//        If a number is positive, it means the element present at its index is not there.
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] > 0){
                list.add(j+1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int [] nums = {1,3,2,1,5};
        System.out.println(findDisappearedNumbers(nums));
    }
}
