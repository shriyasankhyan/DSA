package Medium;
import java.util.Arrays;
public class LM001_581 {
    public static void main(String[] args) {
        int [] nums = {2,6,4,8,10,9,15};
//        System.out.println(findSortedSubarray(nums));
        System.out.println(findUnsortedSubarray(nums));
    }
//    public static int findSortedSubarray(int[] nums) {
//    if(nums.length == 1){
//        return 1;
//    }
//        int [] arr = Arrays.copyOf(nums,nums.length);
//        Arrays.sort(arr);
//        int count = 0;
//        int sortedArray = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]== arr[i]) {
//                if (i == 0 || nums[i-1] == arr[i - 1]) {
//                    count++;
//                }
//                else{
//                    count = 1 ;
//                }
//            }
//            if(count > sortedArray){
//                sortedArray = count;
//            }
//        }
//        return   sortedArray;
//    }
public static int findUnsortedSubarray(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
       int [] arr = Arrays.copyOf(nums,nums.length);
        int firstUnsortedIndex = nums.length-1;
        int lastUnsortedIndex = 0;
        int unsortedIndex = 0;
        Arrays.sort(arr);
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] != arr[i]){
                    unsortedIndex = i;
                    if(lastUnsortedIndex < unsortedIndex){
                        lastUnsortedIndex =i;
                    }
                    if(firstUnsortedIndex > unsortedIndex){
                        firstUnsortedIndex =i;
                    }
                }
            }
            if(firstUnsortedIndex == nums.length-1 && lastUnsortedIndex == 0){
                return 0;
            }
        return lastUnsortedIndex-firstUnsortedIndex +1;
}
}
