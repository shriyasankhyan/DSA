package Easy;

public class LE023_977BGoodSolution {
//    2 pointer approach
//    Since, the array is given in non-decreasing manner. Either the maximum will be on left or on right.
    public static int[] sortedSquares(int[] nums) {
        //result array
        int[] res = new int[nums.length];
        //pointers for left and right
        int leftPointer = 0; int rightPointer = nums.length - 1;
//        We need to iterate from nums.length -1 to 0 as we can find maximum values that we need to put at the end.
        for (int i = nums.length-1; i >= 0; i--) {
            //check if abs left is less than or equal to abs right
            if (Math.abs(nums[leftPointer]) >= Math.abs(nums[rightPointer])) {
                //add left squared to result array
                res[i] = nums[leftPointer] * nums[leftPointer];
                //increment left pointer
                leftPointer++;
            } else {
                //add right squared to result array
                res[i] = nums[rightPointer] * nums[rightPointer];
                //decrement right pointer
                rightPointer--;
            }
        }
        //result
        return res;
    }

    public static void main(String[] args) {
        int [] nums = {-4,-1,0,3,10};
        for (int element : sortedSquares(nums)) {
            System.out.println(element);
        }
    }
}
