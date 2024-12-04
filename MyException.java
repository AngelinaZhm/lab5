public class MyException extends Exception {
    public MyException(String message) {
        super(message); // передаємо повідомлення в конструктор батьківського класу
    }
}
