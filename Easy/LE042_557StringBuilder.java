package Easy;

public class LE042_557StringBuilder {
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)== ' '){
                if(i-1 >= 0) {
                    reverseWord(sb, start, i - 1);
                }
                start = i+1;
            }
        }
        if(start < s.length()) {
            reverseWord(sb, start , s.length()-1);
        }
        return sb.toString();
    }
    static void reverseWord(StringBuilder sb, int start , int end){
        if(end - start < 1){
            return ;
        }
        char temp = sb.charAt(start);
        sb.setCharAt(start ,sb.charAt(end));
        sb.setCharAt(end,temp);
        reverseWord(sb,++start,--end);
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
