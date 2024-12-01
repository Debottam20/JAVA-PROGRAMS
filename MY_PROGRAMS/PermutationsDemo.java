package MY_PROGRAMS;
import java.util.*;
public class PermutationsDemo {
    static int permutationCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0;i <= p.length();i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            count += permutationCount(first + ch + second, up.substring(1));
        }
        return count;
    }

    static void permutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0;i <= p.length();i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permutation(first + ch + second, up.substring(1));
        }

    }

    static ArrayList<String> permutationList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> localAns = new ArrayList<>();
            localAns.add(p);
            return localAns;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0;i <= p.length();i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            ans.addAll(permutationList(first + ch + second, up.substring(1)));
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to get permutations :");
        String str = in.next();
        in.close();
        System.out.println("Number of permutations present : " + permutationCount("", str));
        System.out.printf("The permutations of the string '%s' are : \n",str);
        permutation("", str);
        System.out.printf("The permutations of the string '%s' as a list : \n",str);
        System.out.println(permutationList("", str));
    }
}