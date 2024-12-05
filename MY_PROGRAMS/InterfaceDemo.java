package MY_PROGRAMS;
interface C {
    int d = 5; // No access. Because its static & final by default
    void show1();
}
interface D {
    void show2();
}
interface E extends D {
    void show3();
}
class I implements C,E {

    @Override
    public void show1() {
        System.out.println("I am show1 of interface C");
    }

    @Override
    public void show2(){
        System.out.println("I am show2 of interface D");
    }

    @Override
    public void show3() {
        System.out.println("I am show3 of interface E");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        I obj = new I();
        obj.show1();
        obj.show2();
        obj.show3();
    }
}