import java.util.*;

public class EmployeeDepartmentDetail {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<Employee, Department> data = new HashMap<Employee, Department>();

        System.out.println("Enter number of inputs");
        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.println("\nEnter Employee ID, Employee Name and salary for Employee-" + (i + 1));
            Employee e = new Employee(Integer.parseInt(sc.nextLine()), sc.nextLine(),
                    Double.parseDouble(sc.nextLine()));
            System.out.println("\nEnter Department ID, Department Name and Location for Employee-" + (i + 1));
            Department d = new Department(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
            data.put(e, d);
        }

        SortDepartmentByName sd = new SortDepartmentByName();
        sd.sortDepartment(data);

        sc.close();
    }
}
