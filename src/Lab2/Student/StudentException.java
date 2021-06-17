package Lab2.Student;

public class StudentException extends Exception{
    public StudentException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentException(String message) {
        super(message);
    }
}
