class Professor extends Employee implements Workable,Service,Reportable  {
    private int numberOfLectures;
    private double ratePerLecture;
    public Professor(String firstName, String lastName, int id, String department, boolean isMillitary, int numberOfLectures, double ratePerLecture) {
        super(firstName, lastName, id, department, isMillitary);
        this.numberOfLectures = numberOfLectures;
        this.ratePerLecture = ratePerLecture;
    }
    @Override
    public double calculateSalary() {
        return numberOfLectures * ratePerLecture;
    }
    @Override
    public void isDuty() {
        if (isMilitary()) {
            System.out.println(getFullName() + " is able to take duty.");
        } else {
            System.out.println(getFullName() + " is not able to take duty.");
        }
    }

    @Override
    public void performDuties() {
        System.out.println(getFullName() + " is teaching " + numberOfLectures + " lectures.");
    }
    public void generateReport() {
        System.out.println("Report for administrator : " + getFullName() + ", Hours worked : " + numberOfLectures + ", Rate per lectures : " + ratePerLecture + ", Salary : " + calculateSalary());
    }
}