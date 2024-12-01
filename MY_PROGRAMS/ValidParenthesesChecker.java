package MY_PROGRAMS;
import java.util.*;
public class ValidParenthesesChecker {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char p = str.charAt(i);
            if (p == '(' || p == '{' || p == '[') {
                stack.push(p);
            } else if (stack.empty()) {
                return false;
            } else {
                char top = stack.pop();
                if((top == '(' && p != ')') || (top == '{' && p != '}') || (top == '[' && p != ']')) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string of parentheses : ");
        String str = in.next();
        if(isBalanced(str)) {
            System.out.println("Parentheses is balanced");
        } else {
            System.out.println("Parentheses is not balanced");
        }
    }
}