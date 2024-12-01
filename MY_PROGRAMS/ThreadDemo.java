package MY_PROGRAMS;

class Thread_1 extends Thread {
    public void run() {
        System.out.println("I am getting executed from the Thread_1");
    }
}

class Thread_2 implements Runnable {
    public void run() {
        System.out.println("I am getting executed from the Thread_2");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Thread_1 realFeelings = new Thread_1();
        Thread_2 t2 = new Thread_2();
        Thread heart = new Thread(t2);
        realFeelings.start();
        heart.start();
    }
}