package Easy;

public class LE034_1342 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
    public static int numberOfSteps(int num) {
        int count = 0;
        while(num != 0){
            if(num % 2 == 0) {
                num /= 2;
            }else{
                num--;
            }
            count++;
        }
        return count;
    }


}
