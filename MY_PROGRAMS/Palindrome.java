package MY_PROGRAMS;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the number: ");
        int n = input.nextInt();
        input.close();
        int rev = 0, rem = 0;
        int num = n;
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        if (rev == n) {
            System.out.println("\nThe number is a Palindrome\n");
        } else {
            System.out.println("\nThe number is not a Palindrome\n");
        }
    }
}