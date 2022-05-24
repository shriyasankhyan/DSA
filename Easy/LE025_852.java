package Easy;

public class LE025_852 {
    public static int peakIndexInMountainArray(int[] arr) {
//        Cases
//      1.  If arr[mid] > arr[mid-1] you are in decreasing part of the array.
//        So the answer can be start - mid , with middle included. So we need to check in the LHS.
//      2.  If arr[mid] < arr[mid+1] you are in increasing part of array.
//        So the answer can be mid+1 or greater than that so end will be mid+1. (RHS)

//        When will the loop break?
//        In the end , start and mid will both pointing towards the largest number.
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end- start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
}
