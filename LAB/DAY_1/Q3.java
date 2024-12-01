package LAB.DAY_1;

import java.util.Scanner;

// Q3. Write a java program to replace spaces with underscores.

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = in.nextLine();
        in.close();
        System.out.println("The new string is : " + str.replace(" ", "_"));
    }
}