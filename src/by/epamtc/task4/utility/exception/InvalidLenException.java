package by.epamtc.task4.utility.exception;

public class InvalidLenException extends Exception {

    public InvalidLenException(String message) {
        super(message);
    }

    public InvalidLenException() {
        super();
    }

    public InvalidLenException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidLenException(Throwable cause) {
        super(cause);
    }
}
