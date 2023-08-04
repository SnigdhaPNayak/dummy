public class Employee {
    private int employeeID;
    private String employeeName;
    private double salary;

    public Employee() {

    }

    public Employee(int employeeID, String employeeName, double salary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "\nEmployee ID: " + employeeID + ", Employee Name: " + employeeName + ", Salary: " + salary;
    }

}
