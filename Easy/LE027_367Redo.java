package Easy;

public class LE027_367Redo {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(808201));
    }
    public static boolean isPerfectSquare(int num) {
        if(num == 1 || num==0){
            return true;
        }
        long start = 0;
        //         As generally square roots are smaller than the actual number ,so we can do end = num/2.
//        As int will not be able to handle large numbers. So we have used long here.
        long end = num/2;
        while(start <= end){
            long mid = start+(end-start)/2;
            if(mid*mid == num){
                return true;
            } else if (mid*mid < num) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }
}
