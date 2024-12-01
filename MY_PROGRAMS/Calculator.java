package MY_PROGRAMS;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the first number : ");
        float num1 = input.nextFloat();
        System.out.print("\nEnter the second number : ");
        float num2 = input.nextFloat();
        System.out.print("\nEnter the operator : ");
        char op = input.next().trim().charAt(0);
        input.close();
        switch (op) {
            case '+':
                System.err.print("\nThe sum is : " + (num1 + num2));
                break;
            case '-':
                System.err.print("\nThe subtraction is : " + (num1 - num2));
                break;
            case '*':
                System.err.print("\nThe multiplication is : " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.err.print("\nThe subtraction is : " + (num1 / num2));
                    break;
                } else {
                    System.out.println("\nDivision by Zero not possible\n");
                    break;
                }
            case '%':
                System.err.print("\nThe remainder is : " + (num1 % num2));
                break;
            default:
                System.err.println("\nInvalid input !! Enter a valid operator");
        }
    }
}