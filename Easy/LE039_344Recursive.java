package Easy;

public class LE039_344Recursive {
    public static void reverseString(char[] s) {
        helper(s,0,s.length-1);
    }

    public static void helper(char[] s, int left , int right) {
        if(left >= right){
            return;
        }
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            helper(s,++left,--right);
    }

    public static void main(String[] args) {
        char [] s = {'h','e','l','l','o'};
        reverseString(s);
        for(char c : s){
            System.out.println(c);
        }
    }
}
