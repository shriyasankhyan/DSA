package Easy;

public class LE009_1365 {
    public static void main(String[] args) {
        int [] nums = {8,1,2,2,3};
        for (int element: smallerNumbersThanCurrent(nums)) {
            System.out.println(element);
        }
    }
    public static int numberOfSmallerNums(int [] nums ,int num){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(num > nums[i]){
                count++;
            }
        }
        return count;
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int [] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = numberOfSmallerNums(nums ,nums[i]);
        }
        return arr;
    }
}
