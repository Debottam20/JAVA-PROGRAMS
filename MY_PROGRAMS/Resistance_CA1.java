package MY_PROGRAMS;

import java.util.*;

public class Resistance_CA1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first resistance : ");
        double r1 = in.nextDouble();
        System.out.println("Enter the second resistance : ");
        double r2 = in.nextDouble();
        System.out.println(
                "Main Menu \n1. Series connection\n2. Parallel connection\n3. Both connections\nEnter your choice : ");
        int choice = in.nextInt();
        in.close();
        double ansSeries = 0;
        double ansParallel = 0;
        switch (choice) {
            case 1:
                ansSeries = r1 + r2;
                System.out.println("The equivalent resistance in series connection is : " + ansSeries);
                break;

            case 2:
                ansParallel = (r1 * r2) / (r1 + r2);
                System.out.println("The equivalent resistance in parallel connection is : " + ansParallel);
                break;

            case 3:
                ansSeries = r1 + r2;
                System.out.println("The equivalent resistance in series connection is : " + ansSeries);
                ansParallel = (r1 * r2) / (r1 + r2);
                System.out.println("The equivalent resistance in parallel connection is : " + ansParallel);
                break;

            default:
                System.out.println("Wrong choice");
        }
    }
}