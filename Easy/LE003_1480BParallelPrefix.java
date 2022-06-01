package Easy;
import java.util.Arrays;
public class LE003_1480BParallelPrefix {
    public static int[] runningSum(int[] nums) {
//        Cumulates in parallel, each element of the given array in place, using the supplied function.
//        It takes in (array,op) as parameters. op -> side-effect-free, associative function to perform the cumulation.
//        Parallel prefix computation is usually more efficient than sequential loops for large arrays.

//        Integer:: for every integer of array(::), calculate sum.
        Arrays.parallelPrefix(nums, Integer::sum);
        return nums;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        runningSum(nums);
        for (int i = 0; i < nums.length ; i++) {
            System.out.println(nums[i]);
        }
    }
}
