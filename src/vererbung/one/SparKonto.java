package vererbung.one;

public class SparKonto extends Konto{
    public SparKonto(String inhaber) {
        super(inhaber);
    }
    public void auszahlen(double wert) {
        if (0 >= kontostand - wert) {
            kontostand = kontostand - wert;
        } else System.out.println("Kein Limit!");
    }
}
