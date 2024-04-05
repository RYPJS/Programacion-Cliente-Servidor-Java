package Server.Utils;

public enum PaymentMethods {
    CREDIT_CARD("Tarjeta de crédito"),
    DEBIT_CARD("Tarjeta de débito"),
    PAYPAL("PayPal"),
    BANK_TRANSFER("Transferencia bancaria"),
    CASH("Pago en efectivo");

    private final String methodName;

    PaymentMethods(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodName() {
        return methodName;
    }
}