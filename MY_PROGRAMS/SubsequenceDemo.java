package MY_PROGRAMS;
import java.util.*;
public class SubsequenceDemo {
    static void subsequence(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsequence(p + ch, up.substring(1));
        subsequence(p, up.substring(1));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to find its subsequences");
        String str = in.next();
        in.close();
        System.out.printf("The subsequences of the string '%s' are : \n",str);
        subsequence("", str);
    }
}