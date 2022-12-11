package vererbung.one;

public class JugendGiroKonto extends GiroKonto {
    protected double buchungslimit;
    public JugendGiroKonto(String inhaber, double limit, double buchungslimit) {
        super(inhaber, limit);
        this.buchungslimit = buchungslimit;
    }
    public void auszahlen(double wert) {
        if ((limit * (-1)) <= kontostand - wert) {
            if(buchungslimit<=wert) {
                kontostand = kontostand - wert;
            }else System.out.println("Buchungslimit überschritten!");
        } else System.out.println("Limit überschritten!");
    }
}
