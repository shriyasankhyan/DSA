package Easy;
//Kadane's algorithm
public class LE013_53KadaneAlgorithm {
    public static void main(String[] args) {
        int [] nums = {-2};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(currentSum + nums[i] >= 0){
                currentSum += nums[i];
//                We need to put check here as if we put it after if else statement , it will take 0 as value.
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
            }else{
                currentSum = 0;
            }
        }
        //         It means all the numbers are negative. We will apply simple search afterwards as if negative numbers
        //         are only there , we need the largest number in negative numbers or zero to return.
        //         We will only form one element subarray to get the maximum sum.
        if(maxSum == Integer.MIN_VALUE){
            maxSum = nums[0];
            for (int i = 0; i < nums.length; i++) {
                if(maxSum < nums[i]){
                    maxSum = nums[i];
                }
            }
        }
        return maxSum;
    }
}
