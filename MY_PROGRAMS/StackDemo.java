package MY_PROGRAMS;
import java.util.*;
public class StackDemo {
    public static void pushAtBottom(int data, Stack<Integer> s) {
        if (s.empty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data,s);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s) {
        if (s.empty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top,s);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Scanner in = new Scanner(System.in);
        int choice = 0;
        while (choice != 8) {
            System.out.println("\nWelcome to stack simulation");
            System.out.println("===========================");
            System.out.println("1. PushAtTop() \n2. PushAtBottom()\n3. Pop()\n4. Peek()\n5. IsEmpty()\n6. Reverse\n7. Display \n8. Exit");
            System.out.println("Enter your choice : ");
            choice = in.nextInt();
            in.close();
            switch (choice) {
                case 1:
                    System.out.println("Enter the number to push : ");
                    int num = in.nextInt();
                    s.push(num);
                    System.out.println(num + " is pushed into the stack");
                    break;
                case 2:
                    System.out.println("Enter the number to push at bottom : ");
                    int numAtBottom = in.nextInt();
                    pushAtBottom(numAtBottom, s);
                    System.out.println(numAtBottom + " is pushed into the bottom of the stack");
                    break;
                case 3:
                    if (s.empty()) {
                        System.out.println("The stack is empty nothing to pop");
                    }else {
                        System.out.println("The popped element is : " + s.pop());
                    }
                    break;
                case 4:
                    if (s.empty()) {
                        System.out.println("The stack is empty nothing at top");
                    }else {
                        System.out.println("The top element of the stack is : " + s.peek());
                    }
                    break;
                case 5:
                    if(s.empty()) {
                        System.out.println("The stack is empty");
                    }else {
                        System.out.println("The stack is not empty");
                    }
                    break;
                case 6:
                    reverse(s);
                    System.out.println("The stack got reversed ! Choose display to check");
                    break;
                case 7:
                    if (s.empty()) {
                        System.out.println("The stack is empty nothing to display");
                    }else {
                        System.out.println("The elements of the stack was : " );
                        while(!s.empty()) {
                            System.out.println(s.peek());
                            s.pop();
                        }
                    }
                    break;
                case 8:
                    System.out.println("\nExiting from the simulation .......");
                    return;
                default:
                    System.out.println("Enter a valid choice");
            }
        }
    }
}