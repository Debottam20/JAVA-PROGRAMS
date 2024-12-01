package MY_PROGRAMS;

class MyThread extends Thread {
    int num;
    MyThread (int num) {
        this.num = num;
        System.out.printf("Thread %d is created\n",num);
    }
    @Override
    public void run() {
        System.out.printf("I am thread %d\n",num);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.printf("Thread %d got destroyed\n",num);
    }
}

public class GarbageCollectionDemo {
    public static void main(String[] args) {

//      How can an object be unreferenced ? :- Three methods shown below

        MyThread t1 = new MyThread(1);
//      1. By nulling the reference
        t1 = null;

        MyThread t2 = new MyThread(2);
        MyThread t3 = new MyThread(3);
//      2. By assigning a reference to another
        t3 = t2;

//      3. By anonymous object creation
        new MyThread(4);

//      Calling this method to request JVM to run the garbage collector
        System.gc();
    }
}