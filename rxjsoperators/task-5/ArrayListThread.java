import java.util.*;

class Thread1 implements Runnable {
    private final ArrayList<Integer> al;

    public Thread1(ArrayList<Integer> al) {
        this.al = al;
    }

    public void run() {
        System.out.println("\nOutput from thread1:");
        System.out.println(al);
    }
}

class Thread2 implements Runnable {
    private final ArrayList<Integer> al;

    public Thread2(ArrayList<Integer> al) {
        this.al = al;
    }

    public void run() {
        ArrayList<Integer> revArrayList = new ArrayList<Integer>();
        for (int i = al.size() - 1; i >= 0; i--) {
            revArrayList.add(al.get(i));
        }
        System.out.println("\nOutput from thread2:");
        System.out.println(revArrayList);
    }
}

public class ArrayListThread extends Thread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        System.out.println("Enter the number of inputs");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            al.add(sc.nextInt());
        }

        Runnable list1 = new Thread1(al);
        Thread t1 = new Thread(list1);
        t1.start();

        Runnable list2 = new Thread2(al);
        Thread t2 = new Thread(list2);
        t2.start();

        sc.close();
    }
}
