import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(solution(line));
    }

    static int solution(String line) {
        Stack<Character> stack = new Stack<Character>();
        char c;
        int barCount=0;

        for (int i = 0; i < line.length(); i++) {

            c = line.charAt(i);

            if(c=='(')
            {
                stack.push(c);
            }
            else if(c==')')
            {
                stack.pop();
                if (line.charAt(i - 1) == '(') {
                    barCount += stack.size();
                } else {
                    barCount++;
                }
            }
        }

        return barCount;
    }
}