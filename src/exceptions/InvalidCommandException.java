package exceptions;

public class InvalidCommandException extends Throwable {
    public InvalidCommandException(String message) {
        super(message);
    }
}