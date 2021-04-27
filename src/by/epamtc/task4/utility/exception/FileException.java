package by.epamtc.task4.utility.exception;

public class FileException extends Exception {
    public FileException(String message) {
        super(message);
    }

    public FileException() {
        super();
    }

    public FileException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileException(Throwable cause) {
        super(cause);
    }
}
