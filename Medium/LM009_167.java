package Medium;

public class LM009_167 {
    public static int[] twoSum(int[] numbers, int target) {
        for (int k = 1; k < numbers.length; k++) {
            if (search(numbers, k, target)[0] == -1){

            }else{
                return search(numbers,k,target);
            }
        }
        return new int[] {-1,-1};
    }

    public static int[] search(int [] numbers, int k, int target){
        int start = k;
        int end = numbers.length-1;
        while(start <= end){
            int mid = start+(end - start)/2;
            if(numbers[mid] + numbers[mid-k] == target){
                return new int[]{mid-k +1,mid+1};
            } else if (numbers[mid] + numbers[mid-k] < target) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return new int [] {-1,-1};
    }

    public static void main(String[] args) {
        int [] numbers = {2,3,4};
        int target = 6;
        for(int num : twoSum(numbers,target)){
            System.out.println(num);
        }
    }
}
