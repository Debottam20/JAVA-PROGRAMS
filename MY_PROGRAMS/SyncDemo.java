package MY_PROGRAMS;

// import java.util.concurrent.atomic.AtomicInteger;
// Another way using AtomicInteger

class Counter {
    int count = 0;
    public synchronized void Increment() {
        count++;
    }
    public synchronized void Decrement() {
        count--;
    }
}

public class SyncDemo {
    public static void main(String[] args) {

        Counter c = new Counter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 2000; i++) {
                    c.Increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1200; i++) {
                    c.Decrement();
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Something went wrong");
        }

        System.out.println("The final count value is : " + c.count);
    }
}