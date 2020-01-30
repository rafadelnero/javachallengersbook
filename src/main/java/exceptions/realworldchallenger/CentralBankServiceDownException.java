package exceptions.realworldchallenger;

public class CentralBankServiceDownException extends BusinessException {

    public CentralBankServiceDownException(final Throwable cause) {
        super("The central bank service is currently unavailable", cause, ErrorCode.CENTRAL_BANK_SERVICE_DOWN);
    }

}

