package Payment;

public class MaestroPayment extends Payment{
    private String cardNumber;

    public MaestroPayment(double amount, String currency, String cardNumber) {
        super(amount, currency);
        this.cardNumber = cardNumber;
    }
    @Override
    public double calcTransactionCosts() {
        return 0;
    }

    @Override
    public String toString() {
        return "MaestroPayment{" +
                "cardNumber='" + cardNumber + '\'' +
                "} " + super.toString()+
                "transactionCosts='" + calcTransactionCosts();
    }
}
