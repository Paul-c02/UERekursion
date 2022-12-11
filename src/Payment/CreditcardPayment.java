package Payment;

public class CreditcardPayment extends Payment{
    private String cardNumber;
    private String securityNumber;

    public CreditcardPayment(double amount, String currency, String cardNumber, String securityNumber) {
        super(amount, currency);
        this.cardNumber = cardNumber;
        this.securityNumber = securityNumber;
    }

    @Override
    public double calcTransactionCosts() {
        return 0;
    }

    @Override
    public String toString() {
        return "CreditcardPayment{" +
                "cardNumber='" + cardNumber + '\'' +
                ", securityNumber='" + securityNumber + '\'' +
                "} " + super.toString() +
                "transactionCosts='" + calcTransactionCosts();
    }
}
