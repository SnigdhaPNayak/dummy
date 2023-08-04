import java.util.*;

class store implements Runnable {
    private final ArrayList<ArrayList<String>> al;

    public store(ArrayList<ArrayList<String>> al) {
        this.al = al;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nRunning thread1...");
        System.out.println("Enter number of entries");
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            ArrayList<String> data = new ArrayList<String>();
            data.add(sc.nextLine());
            data.add(sc.nextLine());
            al.add(data);
        }

        Runnable list2 = new display(al);
        Thread t2 = new Thread(list2);
        t2.start();
    }
}

class display implements Runnable {
    private final ArrayList<ArrayList<String>> al;

    public display(ArrayList<ArrayList<String>> al) {
        this.al = al;
    }

    public void run() {
        ArrayList<ArrayList<String>> rem = new ArrayList<ArrayList<String>>();
        System.out.println("\nRunning thread2...");
        for (int i = 0; i < al.size(); i++) {
            ArrayList<String> data = new ArrayList<String>();
            data = (al.get(i));
            if (Integer.valueOf(data.get(1)) <= 0) {
                rem.add(data);
            }
        }

        for (int i = 0; i < rem.size(); i++) {
            al.remove(rem.get(i));
        }

        System.out.println("\nData with age less than or equal to 0, has been removed from the list...");
        for (int i = 0; i < al.size(); i++) {
            ArrayList<String> data = new ArrayList<String>();
            data = (al.get(i));
            System.out.println("Name: " + data.get(0) + ", Age:" + data.get(1));

        }
    }
}

public class PersonDetail {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> arrayList = new ArrayList<ArrayList<String>>();

        Runnable list1 = new store(arrayList);
        Thread t1 = new Thread(list1);
        t1.start();

    }
}
