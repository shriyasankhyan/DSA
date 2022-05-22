package Medium;

import java.util.Arrays;

public class LM001B_581 {
    public static int findUnsortedSubarray(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int[] arr = Arrays.copyOf(nums, nums.length);
        int firstUnsortedIndex = nums.length - 1;
        int lastUnsortedIndex = 0;
        Arrays.sort(arr);
        for (int i = 0; i < nums.length; i++){
           if(nums[i] != arr[i]){
               firstUnsortedIndex = i;
               break;
           }
        }
        for (int i = nums.length-1; i >=0; i--){
            if(nums[i] != arr[i]){
                lastUnsortedIndex = i;
                break;
            }
        }
            if(firstUnsortedIndex == nums.length-1 && lastUnsortedIndex == 0){
                return 0;
            }
        return lastUnsortedIndex-firstUnsortedIndex+1;
    }

    public static void main(String[] args) {
        int [] nums = {2,6,4,8,10,9,15};
        System.out.println(findUnsortedSubarray(nums));
    }
}
