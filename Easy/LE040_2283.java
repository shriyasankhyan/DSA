package Easy;

import java.util.HashMap;

public class LE040_2283 {
        public static boolean digitCount(String num) {
            HashMap<Integer,Integer> map = new HashMap<>();
//        First we are marking the frequency for the number. As we are given in the question, num.charAt(i) is the
//        frequency of the number i in the num String.
            for(int number = 0; number < num.length(); number++){
                int frequency = Character.getNumericValue(num.charAt(number));
                map.put(number,frequency);
            }
//        Now we are traversing through the string.
            for(int index = 0; index< num.length(); index++) {
//            If character at index i is less than num.length(), then only we need to know its frequency.
                if (Character.getNumericValue(num.charAt(index)) < num.length()) {
//                Get the frequency of the number and subtract 1 from it if it is present.
                    int frequency = map.get(Character.getNumericValue(num.charAt(index))) - 1;
                    map.put(Character.getNumericValue(num.charAt(index)), frequency);
                }
            }
//      If all the values are 0 , then only it is right otherwise , the frequency is either more or less than the
//        specified frequency, hence return false;
            for (int i = 0; i < num.length(); i++) {
                if(map.get(i) !=0){
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {
            String num = "1210";
            String num2 = "030";
            System.out.println(digitCount(num));
            System.out.println(digitCount(num2));
        }
    }
