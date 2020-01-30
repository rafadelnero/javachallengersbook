package exceptions.throwthrows;

class BusinessException extends Exception {

    BusinessException() { }

    BusinessException(Exception exception) {
        super(exception);
    }
}
