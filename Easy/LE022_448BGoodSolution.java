package Easy;

import java.util.ArrayList;
import java.util.List;

public class LE022_448BGoodSolution {
//    Since all the numbers are positive. So if we want to mark presence of any number, we can do it by making it a
//    negative number
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int index  = -1;
//        We are going to iterate over the array.
        for (int i = 0; i < nums.length; i++) {
//            Same work is done if the number is marked negative as per the index , we need to check for the
//            current number so that we get to know which index this number belongs.
            if (nums[i] < 0) {
                index = (nums[i] * -1) - 1;
            } else {
//                If a number is positive , then index = number - 1 as array's index are 0 to n-1 and elements are 0-n.
                index = nums[i] - 1;
            }
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
