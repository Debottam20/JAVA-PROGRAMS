package MY_PROGRAMS;

class T1 extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hi from 1");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("From 1");
        }
    }
}
class T2 extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hi from 2");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("From 2");
        }
    }
}
public class ThreadException {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        System.out.println("Priority of 1 is " + t1.getPriority());
        System.out.println("Priority of 2 is " + t2.getPriority());
        t1.setPriority(10);
        t2.setPriority(1);
        System.out.println("Priority of 1 is " + t1.getPriority());
        System.out.println("Priority of 2 is " + t2.getPriority());
        t1.start();
        t2.start();
    }
}