public class Administrator extends Expirience implements Workable,Service,Reportable {
    private int hoursWork;
    private double hourlyRate;

    public Administrator(String firstName, String lastName, int id, String department, boolean isMillitary, int yearsOfExperience, String educationLevel, int hoursWork, double hourlyRate) {
        super(firstName, lastName, id, department, isMillitary, yearsOfExperience, educationLevel);
        this.hoursWork = hoursWork;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWork * hourlyRate;
    }

    @Override
    public void performDuties() {
        System.out.println(getFullName() + " is managing university administration.");
    }

    @Override
    public void isDuty() {
        if (isMilitary()) {
            System.out.println(getFullName() + " is able to take duty.");
        } else {
            System.out.println(getFullName() + " is not able to take duty.");
        }
    }
    public String getDetails() {
        return getFullName() + ", Education Level: " + getEducationLevel() + ", Experience: " + getYearsOfExperience() + " years.";
    }
    public void generateReport() {
        System.out.println("Report for administrator : " + getFullName() + ", Salary : " + calculateSalary() + ", Education level : " + getEducationLevel() + ", Years of experience : " + getYearsOfExperience());
    }
}


