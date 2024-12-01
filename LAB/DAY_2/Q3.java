package LAB.DAY_2;
/* Write a method that takes two integers as input and returns their division. Handle  any potential division by zero exceptions.  */
import java.util.*;
public class Q3 {
    public static int div(int a, int b) {
        return (a / b);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = in.nextInt();
        System.out.println("Enter second number : ");
        int b = in.nextInt();
        try {
            System.out.println("Result : " + div(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Division by zero not possible");
        }
    }
}