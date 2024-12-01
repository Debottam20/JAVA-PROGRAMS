package MY_PROGRAMS;

import java.util.Scanner;

public class Armstrong_Checker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter a number : ");
        int number = input.nextInt();
        input.close();
        if (isArmstrong(number)) {
            System.out.println("\nThe number is an Armstrong number\n");
        } else {
            System.out.println("\nThe number is not an Armstrong number\n");
        }
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int num = n;
        int count = 0, rem = 0, sum = 0;
        // Finding how many digits are present in the number
        while (num != 0) {
            num = num / 10;
            count++;
        }
        // Checking the number
        while (n != 0) {
            rem = n % 10;
            int mul = 1;
            for (int i = 0; i < count; i++) {
                mul = mul * rem;
            }
            sum = sum + mul;
            n = n / 10;
        }

        if (original == sum) {
            return true;
        } else {
            return false;
        }
    }
}