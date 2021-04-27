package by.epamtc.task4.utility.exception;

public class InvalidPosValue extends Exception {
    public InvalidPosValue(String message) {
        super(message);
    }

    public InvalidPosValue() {
        super();
    }

    public InvalidPosValue(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidPosValue(Throwable cause) {
        super(cause);
    }
}
