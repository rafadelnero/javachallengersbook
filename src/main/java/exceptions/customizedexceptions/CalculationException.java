package exceptions.customizedexceptions;

public class CalculationException extends RuntimeException {

    public CalculationException(String message, Throwable cause) {
        super(message, cause);
    }

}
