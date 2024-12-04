abstract class Employee {
    private String firstName;
    private String lastName;
    private int id;
    private String department;
    private boolean isMilitary;

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public Employee(String firstName, String lastName, int id, String department, boolean isMillitary) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.department = department;
        this.isMilitary = isMillitary;
    }

    public abstract double calculateSalary();

    public String getFullName() {
        return firstName + " " + lastName;
    }
    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + getFullName() + ", Department: " + department;
    }
}