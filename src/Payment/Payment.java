package Payment;

public abstract class Payment {
    private double amount;
    private String currency;

    public Payment(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public abstract double calcTransactionCosts();

    public double exchangeToEUR() {
        switch (currency) {
            case "EUR": amount = amount;
            case "USD": amount /= 1.1;
            case "GBP": amount /= 0.85;
            case "SEK": amount /= 9.5;
            case "HUG": amount /= 310;
            default: amount /=2;
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
