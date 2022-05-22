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
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
            }else{
                currentSum = 0;
            }
        }
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
