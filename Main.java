public class Main {    public static void main(String[] args) {

    Administrator administrator = new Administrator("Anna", "Pavlova", 1, "Facultet CZ", false,4,"Bachelor",12,100 );
    Professor professor = new Professor("Yulia", "Nazar",1,"ITTS",true,9,200);

    System.out.println("Administrator :");
    administrator.performDuties();
    administrator.isDuty();
    System.out.println(administrator.getDetails());
    administrator.generateReport();

    System.out.println("Professor :");
    professor.performDuties();
    professor.isDuty();
    professor.generateReport();


    int[] numbers = {1, 2, 3, 4, 5, 6};

    for (int number : numbers) {
        try {
            checkOddNumber(number);
            System.out.println("Число " + number + " - непарне.");
        } catch (MyException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}

    public static void checkOddNumber(int number) throws MyException {
        if (number % 2 == 0) {
            throw new MyException("Число " + number + " є парним, а ми шукаємо непарне.");
        }
    }
}






