package exampleprojects.EMPLOYEE.MANAGER.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message) {
        super(message);
    }
}
