package LAB.DAY_1;

import java.util.Scanner;

// Q6. Write a java program to sum 1st n even numbers using any loop.

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the number of even numbers : ");
        int num = in.nextInt();
        in.close();
        for (int i = 1; i <= num; i++) {
            sum = sum + 2 * i;
        }
        System.out.printf("The sum of first %d even numbers is : %d",num,sum);
    }
}