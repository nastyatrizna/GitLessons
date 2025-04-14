package by.homework.lessons.task16;

public class AccountNotFoundException extends Exception {
    private String errorCode;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public AccountNotFoundException(String message) {
        super(message);
    }

}
