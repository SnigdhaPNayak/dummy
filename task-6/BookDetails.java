import java.util.*;
import java.io.*;

public class BookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of entries");
        int num = Integer.parseInt(sc.nextLine());
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < num; i++) {
            System.out.println("\nEnter Book Title, Author and Price for Book-" + (i + 1));
            Book book = new Book(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
            list.add(book.toString());
        }

        try {
            FileWriter w = new FileWriter("Data/BookData.txt");
            for (int i = 0; i < num; i++) {
                w.write(list.get(i) + "\n");
            }
            w.close();
            System.out.println("\nBook Details:");
            FileReader r = new FileReader("Data/BookData.txt");
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
