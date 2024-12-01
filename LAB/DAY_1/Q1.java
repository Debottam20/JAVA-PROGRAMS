package LAB.DAY_1;

import java.util.Scanner;

// Q1. Use comparison operators to find out whether a given number is greater than the user entered or not.

public class Q1 {
    public static void main(String[] args) {
        double given = 100; // Let it be 100
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        double num = in.nextDouble();
        in.close();
        if (given > num) {
            System.out.println("Given number is greater");
        } else if (given == num) {
            System.out.println("Both are same");
        } else {
            System.out.println("User entered number is greater");
        }
    }
}