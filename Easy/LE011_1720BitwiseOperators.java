package Easy;

/* BITWISE OPERATORS IN JAVA
*  |  Bitwise OR
*  &  Bitwise AND
*  ^  Bitwise XOR
*  ~  Bitwise Complement
*  << Left Shift
*  >> Signed Right Shift
*  >>> Unsigned Right Shift
* If a XOR b = c    then b XOR c = a and a XOR c = b
*/

public class LE011_1720BitwiseOperators {
    public static void main(String[] args) {
        int [] encoded = {1,2,3};
        int first = 1;
        int [] decoded = decode(encoded,first);
        for (int i = 0; i < decoded.length; i++) {
            System.out.println(decoded[i]);
        }
    }
    public static int[] decode(int[] encoded, int first) {
        int[] decoded = new int [encoded.length + 1];
        decoded[0] = first;
//        firstDecoded ^ secondDecoded = firstEncoded
//        Hence , secondDecoded = firstEncoded ^ firstDecoded
//        decodedArray[1] = encoded[0] ^ decodedArray[0];
//        decodedArray[2] = encoded[1] ^ decodedArray[1];
        for (int i = 1; i < decoded.length; i++) {
            decoded[i] = encoded[i-1] ^ decoded[i-1];
        }
        return decoded;
    }
}
