import java.util.Stack;

class Solution {
    boolean solution(String s) {
       boolean check = true;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == '(')
            {
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) ==')')
            {
                if(stack.isEmpty())
                {
                    check = false;
                    break;
                }
                else if(stack.peek()=='(')
                {
                    stack.pop();
                }
            }
        }
        if (!(stack.isEmpty())) {
            check = false;
        }

        return check;
    }
}