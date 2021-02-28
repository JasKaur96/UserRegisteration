package userregisteration;

public class UserRegistrationException extends Exception{
    public enum ExceptionType {
        ENTERED_NULL, ENTERED_EMPTY
    }
    public ExceptionType type;
    public UserRegistrationException(String message, ExceptionType enteredNull){
        super(message);
    }
}
