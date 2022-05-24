package Hard;

public class LH002_410GoodQuestion {
    public static int splitArray(int[] nums, int m) {
//        Minimum number of partitions (m) that we can make = 1.
//        The Largest sum of minimum partition sub-array = 1 partition Hence whole array sum.
        int end = 0;
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            end += nums[i];
            start = Math.max(start,nums[i]);
        }
//        Maximum number of partitions (m) that we can make = nums.length
//        The Largest sum of maximum partition sub-array = every individual element.
//        Hence, the largest element of the array.

//        Answer will lie between start and end.
        while(start < end){
            int possibleSum = start + (end - start)/2;

//            Calculate how many pieces you can divide this in with this max sum.
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum + num > possibleSum){
//                    You cannot add this in this subarray make new one.
                    sum = num;
                    pieces ++;
                }else{
                    sum += num;
                }
            }
//            If pieces < m , then it means we need more pieces to reach m. But we cannot increase the number of pieces.
//            So, by decreasing the possibleSum , we can have lesser elements in a piece so that elements gets
//            accumulated in greater number of pieces, hence pieces might reach m. So end = mid-1;
            if(pieces > m){
                start = possibleSum+1;
            }
            else{
                end = possibleSum;
            }
//            If pieces > m , then it means we need less pieces to reach m. But we cannot decrease the number of pieces.
//            So, by increasing the possibleSum , we can have more elements in a piece so that elements gets accumulated
//            in fewer number of pieces, hence pieces might reach m. So start = mid;

        }
        return start;
    }

    public static void main(String[] args) {
        int [] nums = {7,2,5,10,8};
        System.out.println(splitArray(nums,2));
    }
}
