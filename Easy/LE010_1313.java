package Easy;

public class LE010_1313 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        for (int element : decompressRLElist(nums)) {
            System.out.println(element);
        }
    }
    public static int[] decompressRLElist(int[] nums) {
        int [] arr = new int[findArrayLength(nums)];
        int arrFilled = 0;
        for (int valueIndex = 1; valueIndex < nums.length ; valueIndex+=2) {
            int value = nums[valueIndex];
            int frequency = nums[valueIndex-1];
            arr = insertNumsInArray(arr,value,frequency ,arrFilled);
            arrFilled += frequency;
        }
        return arr;
    }
    public static int findArrayLength(int[] nums){
        int arrayLength = 0;
        for (int frequencyIndex = 0; frequencyIndex < nums.length; frequencyIndex+=2) {
            arrayLength +=nums[frequencyIndex];
        }
        return arrayLength;
    }
    public static int[] insertNumsInArray(int [] arr , int value,int frequency, int arrFilled){
        for (int i =0; i < frequency; i++) {
            arr[arrFilled+i] = value;
        }
        return arr;
    }
}
