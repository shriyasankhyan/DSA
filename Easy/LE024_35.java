package Easy;

public class LE024_35 {
    public static int searchInsert(int[] nums, int target) {
        //         We try to find element in the middle of 2 elements.
//         Initially, nums[start] <= target <= nums[end]
//         If found , then return mid.
//        If not , for example 4 in 1 3 5 6 , as start and end have crossed each other so start
//         is at 5 and end is at 3 , in these 2 numbers 4 had to be there , since it is greater than 3 so it will be
//         inserted at next position after 3 which is start.
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = (start) + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int [] nums = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(nums,target));
    }
}
