import java.util.*;

public class EmployeePhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Long> phoneNumber = new LinkedList<Long>();
        System.out.println("Enter 5 Employee's Phone Number");
        for (int i = 0; i < 5; i++) {
            phoneNumber.add(sc.nextLong());
        }
        System.out.println("\nSaved Phone Numbers:");
        Iterator<Long> itr = phoneNumber.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        sc.close();
    }
}
