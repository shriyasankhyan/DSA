package Easy;

import java.util.HashSet;

public class LE032_217 {
//    The add() is a method of Java HashSet class which adds the specified element to this set if this set contains
//    no element. If it is already contain the element, the call leaves the set unchanged and returns false.
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}
