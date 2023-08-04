import java.util.*;
import java.io.*;

public class ReadDirectory {
    public static void main(String[] args) {
        String[] files;
        Scanner sc = new Scanner(System.in);
        // input - Data
        System.out.println("Enter name of a directory");
        String dir = sc.nextLine();

        File f = new File(dir);

        files = f.list();

        System.out.println("\nList of files and directories inside directory-" + dir);
        for (String file : files) {

            System.out.println(file);
        }

    }
}
