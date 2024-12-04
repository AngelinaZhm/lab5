public abstract class Expirience extends Employee {
    private int yearsOfExperience;
    private String educationLevel;

    public Expirience(String firstName, String lastName, int id, String department, boolean isMillitary, int yearsOfExperience, String educationLevel) {
        super(firstName, lastName, id, department, isMillitary);
        this.yearsOfExperience = yearsOfExperience;
        this.educationLevel = educationLevel;
    }
    public String getEducationLevel() {
        return educationLevel;
    }
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    public abstract String getDetails();
}
