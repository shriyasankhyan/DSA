package Easy;

public class LE036_1539B {
    public static int findKthPositive(int[] arr, int k) {
        int i = 1;
        int start = 0;
        while(k >= 0) {
            if (binarySearch(arr, start, i) == -1) {
                k--;
                if(k ==0){
                    return i;
                }
                i++;
            } else {
                start++;
                i++;
            }
        }
        return i;
    }
    public static int binarySearch(int [] arr, int start , int number ){
        int end = arr.length-1;
        while(start <=end){
            int mid = start+(end - start)/2;
            if(arr[mid] == number){
                return mid;
            } else if (arr[mid] < number) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int [] arr = {6};
        System.out.println(findKthPositive(arr,5));
    }
}
