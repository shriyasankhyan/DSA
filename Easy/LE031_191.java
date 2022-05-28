package Easy;

public class LE031_191 {
    // you need to treat n as an unsigned value
    public  static int hammingWeight(int n) {
        int count = 0;
//        Converts an integer to a binary string of 0s and 1s.
        String s = Integer.toBinaryString(n);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
    public static void main(String [] args){
//        It gets converted from binary code to a number.
        int n = 00000000000000000000000000001011;
        System.out.println(hammingWeight(n));
    }
}
