package MY_PROGRAMS;

abstract class A {
    public abstract void show();
    public void display() {
        System.out.println("I am in A");
    }
}
class B extends A {
    @Override
    public void show() {
        System.out.println("I am in B show");
    }
}
public class AbstractionDemo {
    public static void main(String[] args) {
        A obj = new B();
        obj.display();
        obj.show();
    }
}
