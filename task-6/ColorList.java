import java.util.*;
import java.io.*;

public class ColorList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Entries");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println("Enter " + num + " colours:");
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < num; i++) {
            list.add(sc.nextLine());
        }
        try {
            FileWriter w = new FileWriter("Data/ColorData.txt");
            for (int i = 0; i < num; i++) {
                w.write(list.get(i) + "\n");
            }
            w.close();
            System.out.println("\nContent of the File:");
            FileReader r = new FileReader("Data/ColorData.txt");
            int i;
            while ((i = r.read()) != -1) {
                System.out.print((char) i);
            }
            r.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
