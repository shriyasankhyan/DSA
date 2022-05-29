package Easy;

import java.util.Arrays;

public class LE041_1608 {
    public static void main(String[] args) {
        int [] nums = {3,9,7,8,3,8,6,6};
        System.out.println(specialArray(nums));
    }
    public static int specialArray(int[] nums) {
        int start = 0;
        Arrays.sort(nums);
        int end = nums[nums.length-1];

        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid == numGreater(nums,mid)){
                return mid;
            } else if (mid < numGreater(nums, mid)) {
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static int numGreater(int [] nums, int num){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= num){
                count++;
            }
        }
        return count;
    }
}
