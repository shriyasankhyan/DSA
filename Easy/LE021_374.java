package Easy;

public class LE021_374 {
    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }
    public static int guess(int num){
        int number = 5;
        if(num == number){
            return 0;
        } else if (num < number) {
            return 1;
        }else {
            return -1;
        }
    };
    public static int guessNumber(int n) {
        int start = 1;
        int end = n;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(guess(mid) == 0 ){
                return mid;
            }
            else if(guess(mid) == 1){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
