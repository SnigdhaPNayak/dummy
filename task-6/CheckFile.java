import java.util.*;
import java.io.*;

public class CheckFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file name");

        // Input - Data/DummyData.txt
        String fileName = sc.nextLine();
        File file = new File(fileName);
        System.out.println("\nFile exists- " + file.exists());
        System.out.println("\nContent of the file:");
        try {
            FileReader r = new FileReader(fileName);
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