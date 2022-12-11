package Payment;

public class CashPayment extends Payment{
    private String name;

    public CashPayment(double amount, String currency, String name) {
        super(amount, currency);
        this.name = name;
    }
    public CashPayment(double amount, String currency) {
        super(amount, currency);
    }
    @Override
    public double calcTransactionCosts() {
        return 0;
    }

    @Override
    public String toString() {
        return "CashPayment{" +
                "name='" + name + '\'' +
                "} " + super.toString()+
                "transactionCosts='" + calcTransactionCosts();
    }
}
