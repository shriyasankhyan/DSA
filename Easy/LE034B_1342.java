package Easy;

public class LE034B_1342 {
    public static int numberOfSteps(int num) {
        return helper(num , 0);
    }

    static int helper(int num , int count){
        if(num == 0){
            return count;
        }
        if(num%2 == 0){
            return helper(num/2,++count);
        }else{
            return helper(--num , ++count);
        }
    }
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
}
