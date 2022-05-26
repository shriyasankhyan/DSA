package Hard;

import java.util.Stack;

public class LH003_32Redo {
//    We cannot use Kadane algorithm here as (()) has 4 count and if we use Kadane algorithm, it will give a count of 2.
    public static int longestValidParentheses(String s) {
//       We are using stack so that we can keep track of left parentheses '(' of the longest substring.
        Stack<Integer> stack = new Stack<>();
//        Count for counting the parentheses string.
        int count = 0;
        int left = -1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
//                We are adding the index of '(' if '(' is present.
                stack.push(i);
            }
            else{
//                If stack is empty left = index of ')' element.
                if(stack.isEmpty()){
                    left = i;
                }else{
//                    Either the string will be empty or it will have ')' because for '(' we checked previously above.
//                    For ')', we will pop the stack.
                    stack.pop();
//                    After popping , if now the stack is empty, count is compared to i - left, i contains the element
//                    ')' after which '(' started. i is the current element index.
//                    Since count of numbers = difference +1 , but left is not the '(' starting element index but an
//                    element lesser than that. Hence, count is being compared to i-left = i-(index of '(' -1), which is
//                    eventually equal to i - left = i - index of '('  +1 , which is difference.
                    if(stack.isEmpty()){
                        count = Math.max(count, i-left);
                    }else{
//                        If the stack is not empty , count = current index - stack.peek() which shows the top element
//                        in the stack after removing one element.
                        count = Math.max(count,i-stack.peek());
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = ")()(())";
        System.out.println(longestValidParentheses(s));
    }
}
