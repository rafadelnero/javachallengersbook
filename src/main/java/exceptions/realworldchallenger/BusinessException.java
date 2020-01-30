package exceptions.realworldchallenger;

public class BusinessException extends Exception {

    ErrorCode errorCode;

    public BusinessException(String message, Throwable cause, ErrorCode errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

}

