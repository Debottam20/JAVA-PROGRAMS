package MY_PROGRAMS;

class Sum {
    int a, b;
    char p, q;
    
    Sum() {
        a = 1;
        b = 1;
        p = 'a';
        q = 'b';
        System.out.println("This is getting called by default");
    }

    Sum(int x, int y) {
        a = x;
        b = y;
    }

    Sum(char m, char n) {
        p = m;
        q = n;
    }

    void show() {
        System.out.println("Integer sum is : " + (a + b));
        System.out.println("Char Ascii sum is : " + (p + q) + "\n");
    }
}

public class Constructor {
    public static void main(String[] args) {
        Sum add1 = new Sum();
        Sum add2 = new Sum(32, 55);
        Sum add3 = new Sum('D', 'M');
        add1.show();
        add2.show();
        add3.show();
    }
}