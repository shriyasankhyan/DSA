package Easy;

public class LE035_441 {
    public static int arrangeCoins(int n) {
//        1      1+2       1+2+3    1+2+3+4 n(n+1)/2
//        2/2    2(3)/2    3(4)/2
        long start = 0;
        long end = n;
        while(start <= end){
            long mid = start +(end - start)/2;
            if((mid*(mid+1))/2 == n){
                return (int)mid;
            } else if ((mid*(mid+1))/2 < n) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
//        end will be back now so end as it means the last staircase is not complete.
        return (int)end;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(1804289383));
    }
}
