import java.io.IOException;

public class WrongPasswordException extends IOException {
    public WrongPasswordException() {
        super();
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
