package Easy;

public class LE048_1332ThumbsDown {
    public int removePalindromeSub(String s) {
        if (isPalindrome(s)) return 1;
        return 2;
    }

    private boolean isPalindrome(String s) {
        int i = 0, n = s.length();
        while (i <= n/2)
            if (s.charAt(i) != s.charAt(n-1-i++)) return false;
        return true;
    }
}
