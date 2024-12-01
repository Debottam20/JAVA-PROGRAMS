package MY_PROGRAMS;

import java.util.Scanner;

public class Prime_Checker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter a number : ");
        int num = input.nextInt();
        input.close();
        if (isPrime(num)) {
            System.out.println("\nThe number is Prime\n");
        } else {
            System.out.println("\nThe number is not Prime\n");
        }
    }

    static boolean isPrime(int n) {
        int flag = 0;
        if (n == 1) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag++;
                    break;
                }
            }
            if (flag == 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}