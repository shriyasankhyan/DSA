package Medium;

public class LM005_33GoodQuestion {
    public static void main(String[] args) {
        int [] nums = {4,5,6,7,8,1,2,3};
        int target = 8;
        System.out.println(search(nums,target));
    }

    public static int search(int[] nums, int target) {
        int pivotIndex = findingPivot(nums , target);
        if(pivotIndex != -1){
            if(nums[pivotIndex] == target){
                return pivotIndex;
            }
            else if(target >= nums[0]){
                return binarySearch(nums,0,pivotIndex,target);
            }else{
               return binarySearch(nums,pivotIndex+1,nums.length-1,target);
            }
        }
        return binarySearch(nums,0,nums.length-1,target);
    }

//    Finding the pivot index from where the array is rotated.(In this , the largest number)
    public static int findingPivot(int [] nums , int target){
//        If the array is  not rotated it means 0 index is at 0 only. Hence , k = 0.
//        Or we can understand k is the number of rotations. If array is not rotated, number of rotations = 0.

//        If the array is not rotated nums[start] < nums[end]
        if(nums[0] < nums[nums.length-1]){
            return -1;
        }
        int start = 0;
        int end = nums.length -1;
//        3 4 5 6 7 1 2  increasing pivot increasing
//        if nums[mid] > nums[start], it means we are in first increasing order.So we need to increase the start.
        while(start <= end){
            int mid = start +(end - start)/2;
            if(mid+1 < nums.length && nums[mid] > nums[mid+1]){
                return mid;
            }
            else if(mid-1 >= 0 && nums[mid-1] > nums[mid]){
                return mid-1;
            }
            else if(nums[mid] <= nums[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return -1;
    }
    public static int binarySearch(int [] nums , int start , int end, int target){
       while(start <= end){
           int mid = start +(end - start)/2;
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
        return -1;
    }
//    If we were asked to find pivot with duplicates.
    public static int findingPivotWithDuplicates(int [] nums , int target){
        if(nums[0] < nums[nums.length-1]){
            return -1;
        }
        int start = 0;
        int end = nums.length -1;
//        3 4 5 6 7 1 2  increasing pivot increasing
//        if nums[mid] > nums[start], it means we are in first increasing order.So we need to increase the start.
        while(start <= end){
            int mid = start +(end - start)/2;
            if(mid+1 < nums.length && nums[mid] > nums[mid+1]){
                return mid;
            }
            else if(mid-1 >= 0 && nums[mid-1] > nums[mid]){
                return mid-1;
            }
//       If elements at middle, start and end are equal, then just skip the duplicates.
            if(nums[mid] == nums[start] && nums[mid] == nums[end]){
//                Skip the duplicates
//                If start is the pivot
                if(nums[start] > nums[start+1]){
                    return start;
                }
//                If end is the pivot
                if(nums[end] < nums[end-1]){
                    return end-1;
                }
                start++;
                end--;
            } else if (nums[start] <= nums[mid] && nums[end]<nums[mid]) {
//                Just check in the RHS array increasing till mid and then decreasing.
//                We know mid is not the answer otherwise it would have been caught the very first. So start = mid+1.
                start = mid+1;
            }
//            If array has decreased when we move from start to mid as our array is increasing and then decreasing  ,
//            it means it has increased and then decreased in the first part of the array.
//            Or if end element is less than equal to  mid-element, then it means array decreased in the second half,
//            again our answer lies in the increasing half , that is , first half of the array.
//                We know mid is not the answer otherwise it would have been caught the very first. So end = mid-1.
            else{
                end = mid-1;
            }
        }

        return -1;
    }
}
