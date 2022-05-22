package Easy;

public class LE018_744 {
    public static void main(String[] args) {
        char [] letters = {'c','f','j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(letters,target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while(start <= end){
            int mid = start +(end-start)/2;
//            Note If else are to be used in the same order.
//           a c c c d start = 0 end = 4 mid = 2 therefore start = 3  mid = 3 start = 4
//            If they are reversed,
//            a c c c d start = end = 4 mid = 2 therefore end = 1 ,so we will move left when target == letters[mid] ,
//            that is , towards letter smaller than target ,but we need larger one.
             if(target < letters[mid]){
                 end = mid-1;
            }
            else{
                 start = mid+1;
            }
        }
        return letters[start % letters.length];
    }
}
