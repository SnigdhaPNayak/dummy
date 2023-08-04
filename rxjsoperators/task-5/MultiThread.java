//Extending java.lang.Thread class
class MultiThread1 extends Thread {
    public void run() {
        System.out.println("Thread1:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
}

// java.lang.Runnable interface
class MultiThread2 implements Runnable {
    public void run() {
        System.out.println("Thread2:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}

public class MultiThread extends Thread {
    public static void main(String[] args) {
        MultiThread1 t1 = new MultiThread1();
        t1.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println();
        MultiThread2 t = new MultiThread2();
        Thread t2 = new Thread(t);
        t2.start();
    }
}

/*
 * When we extend the Thread class, each of our threads produces and associates
 * with a unique object.
 * When Runnable is implemented, it distributes the same object across several
 * threads.
 */