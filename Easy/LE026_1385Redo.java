package Easy;
import java.util.Arrays;
public class LE026_1385Redo {
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int distance = 0;
//      Distance d should be    |arr1[i] - arr2[j]| <=d
//      Therefore, arr1[i] - d <= arr2[j] <= arr[i] +d
        for (int val : arr1) {
            if (notInRange(arr2, val - d, val + d)) {
                distance++;
            }
        }

        return distance;
    }
    public static boolean notInRange(int[] arr, int from, int to) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
//            When from and to cross each other , it means there is no distance to satisfy the given condition.
            if (arr[mid] >= from && arr[mid] <= to) {
                return false;
            } else if (arr[mid] < from) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {4,5,8};
        int [] arr2 = {10,9,1,8};
        int d = 2;
        System.out.println(findTheDistanceValue(arr1,arr2,d));
    }
}
