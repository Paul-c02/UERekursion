package vererbung.one;

public class GiroKonto extends Konto {
    protected double limit;

    public GiroKonto(String inhaber, double limit) {
        super(inhaber);
        this.limit = limit;
    }

    public void auszahlen(double wert) {
        if ((limit * (-1)) <= kontostand - wert) {
            kontostand = kontostand - wert;
        } else System.out.println("Limit überschritten!");
    }
}
