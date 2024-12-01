/*Write a program by using a class with the following specifications:

Class name — Calculate

Instance variables:

int num
int f
int rev
Member Methods:

Calculate(int n) — to initialize num with n, f and rev with 0 (zero)
int prime() — to return 1, if number is prime
int reverse() — to return reverse of the number
void display() — to check and print whether the number is a prime palindrome or not */
package MY_PROGRAMS;

import java.util.*;

public class Find_Palindromic_Prime {

    int num, f, rev;

    void Calculate(int n) {
        num = n;
        f = 0;
        rev = 0;
    }

    public int prime() {
        if (num == 1) {
            return 0;
        } else {
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    f++;
                    break;
                }
            }
            if (f == 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public int reverse() {
        int n = num;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return rev;
    }

    void display() {
        if ((prime() == 1) && (num == reverse())) {
            System.out.println(num + " is a Palindromic Prime");
        } else {
            System.out.println(num + " is not a Palindromic Prime");
        }
    }
}

class Calculate_main {
    public static void main(String[] args) {
        Find_Palindromic_Prime obj = new Find_Palindromic_Prime();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = in.nextInt();
        in.close();
        obj.Calculate(a);
        obj.display();
    }
}