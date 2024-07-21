package alisson.data_contracts.handler;

public class DataContractNotFoundException extends RuntimeException {
    private String message;

    public DataContractNotFoundException() {}

    public DataContractNotFoundException(String message) {
        super(message);
        this.message = message;
    }

}
