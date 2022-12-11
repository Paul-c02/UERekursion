package vererbung.two;

public class Bundesland extends Land {
    protected double bSP;

    public Bundesland(double bSP) {
        this.bSP = bSP;
    }

    public double getbSP() {
        return bSP;
    }
}
