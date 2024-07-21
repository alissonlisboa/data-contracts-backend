package alisson.data_contracts.handler;

public class DataUsageAgreementNotFoundException extends RuntimeException {
    private String message;

    public DataUsageAgreementNotFoundException() {}

    public DataUsageAgreementNotFoundException(String message) {
        super(message);
        this.message = message;
    }
}
