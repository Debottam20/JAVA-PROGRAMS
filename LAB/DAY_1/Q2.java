package LAB.DAY_1;

import java.util.Scanner;

// Q2. Write a java program to convert a string to lowercase and uppercase.

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = in.nextLine();
        in.close();
        System.out.println("The string in uppercase : " + str.toUpperCase());
        System.out.println("The string in lowercase : " + str.toLowerCase());
    }
}