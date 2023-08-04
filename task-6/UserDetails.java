import java.util.*;
import java.io.*;

public class UserDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of entries");
        int num = Integer.parseInt(sc.nextLine());
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < num; i++) {
            System.out.println(
                    "\nEnter First name, Last name, Email ID and Contact Number to register for User-" + (i + 1));
            User user = new User(sc.nextLine(), sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()));
            list.add(user.toString());
        }

        try {
            FileWriter w = new FileWriter("Data/UserData.txt");
            for (int i = 0; i < num; i++) {
                w.write(list.get(i) + "\n");
            }
            w.close();
            System.out.println("\nUser Details:");
            FileReader r = new FileReader("Data/UserData.txt");
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
