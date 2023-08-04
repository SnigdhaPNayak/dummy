public class Department {
    private int departmentID;
    private String departmentName, location;

    public Department() {

    }

    public Department(int departmentID, String departmentName, String location) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.location = location;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getlocation() {
        return location;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String toString() {
        return "\nDepartment ID: " + departmentID + ", Department Name: " + departmentName + ", Location: " + location;
    }

}
