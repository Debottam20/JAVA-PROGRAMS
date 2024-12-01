package MY_PROGRAMS;

import java.util.Scanner;

public class Fibonacci_Sequence {
    public static void main(String[] args) {
        int t1 = 0;
        int t2 = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter number of terms : ");
        int n = input.nextInt();
        input.close();
        System.out.print(t1 + " " + t2);
        for (int i = 2; i < n; i++) {
            int t3 = t1 + t2;
            System.out.print(" " + t3);
            t1 = t2;
            t2 = t3;
        }
    }
}