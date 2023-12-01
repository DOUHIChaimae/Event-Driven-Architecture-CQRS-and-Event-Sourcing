package ma.enset.accountserviceaxon.commonapi.dtos;

public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
