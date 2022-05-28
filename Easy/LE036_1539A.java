package Easy;

public class LE036_1539A {
    public static int findKthPositive(int[] arr, int k) {
        int number = 1;
        int i = 0;
       while( k >=0){
           if(i == arr.length-1 ){
               if(arr[i] == number){
                   number++;
                   i++;
               }else{
                   k--;
                   if(k == 0){
                       return number;
                   }
                   number++;
               }
           }
           else if(i < arr.length && arr[i] == number){
                number++;
                i++;

            }else{
                k--;
                if(k == 0){
                    return number;
                }
                number++;
            }
        }
        return number+k-1;
    }

    public static void main(String[] args) {
        int [] arr = {9};
        int k = 7;
        System.out.println(findKthPositive(arr,k));
    }
}
