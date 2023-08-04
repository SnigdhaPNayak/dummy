import java.util.*;
import java.io.*;

public class QuestionDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of entries");
        int num = Integer.parseInt(sc.nextLine());
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < num; i++) {
            System.out.println("\nEnter Question Title, Question and Created By for Q-" + (i + 1));
            QuestionBank question = new QuestionBank(sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(question.toString());
        }

        try {
            FileWriter w = new FileWriter("Data/QuestionData.txt");
            for (int i = 0; i < num; i++) {
                w.write(list.get(i) + "\n");
            }
            w.close();
            System.out.println("\nQuestion Bank:");
            FileReader r = new FileReader("Data/QuestionData.txt");
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
