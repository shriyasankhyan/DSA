package Easy;

public class LE028_69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }

    public static int mySqrt(int x) {
        if(x < 1){
            return 0;
        }
        else if(x < 4){
            return 1;
        }else {
            long start = 0;
            long end = x/2;
            while (start <= end){
                long mid = start +(end - start)/2;
                long square = mid*mid;
                if(square == x){
                    return (int)(mid);
                } else if (square < x) {
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
            return (int)(end);
        }
    }
}
