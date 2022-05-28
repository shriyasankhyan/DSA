package Medium;

public class LM003_034 {
    public static void main(String[] args) {
        int [] arr = {5,7,7,7,7,8,8,10};
        int target = 7;
        for(int index : searchRange(arr,target)){
            System.out.println(index);
        }
    }
    public static int[] searchRange(int[] nums, int target) {
        int start = occurrence(nums,target,true);
//        If we could not find the element in the array.
        if(start != -1) {
//            We could have found the first occurence and then run a while loop for other one. But that will again make
//            its time complexity O(N) and kill the purpose of binary search , whose time complexity in worst case is
//            O(logn)
            int end = occurrence(nums, target, false);
            return new int [] {start,end};
        }
        return new int [] {-1,-1};
    }
    public static int occurrence(int [] nums , int target , boolean firstOccurrence){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == nums[mid]){
                ans = mid;
                if(firstOccurrence){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return ans;
        }
    }

