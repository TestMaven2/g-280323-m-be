package lesson24.task4;

public class TooSmallAgeException extends RuntimeException {

    public TooSmallAgeException(String message) {
        super(message);
    }
}