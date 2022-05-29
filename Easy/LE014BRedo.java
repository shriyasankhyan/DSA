package Easy;

import java.util.HashMap;

public class LE014BRedo {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> table = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
//            We are keeping nums[i] as index as we need to search for nums[i] + nums[j] = target.
            table.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
//            Number that we need to find in hashmap such that number + compliment = target.
//            For example, 2 + 3 = 5 . we have 2 now if 3 is there in the table
//            ( we have put all the elements in the table) , so it will return index of 3 if it is present.
            int compliment = target - nums[i];
            Integer index = table.get(compliment);
//            If index is present , it will not be equal to null and if index is not equal to i. It means we are not
//            taking repeated element.( As it is given in the question that you should not use the same element twice),
//            return the indices.
            if(index != null && !index.equals(i)){
                return new int [] {i,index};
            }
        }
//        If still the number is not found
        return new int [] {-1,-1};
    }

    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
        for(int element : twoSum(nums,target)){
            System.out.println(element);
        }
    }
}
