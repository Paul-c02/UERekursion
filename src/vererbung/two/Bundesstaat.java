package vererbung.two;

import java.util.ArrayList;

public class Bundesstaat extends Land{
    private ArrayList<Land> laender = new ArrayList<>();

    public Bundesstaat() {
    }

    public void addLand(Land l) {
       laender.add(l);
    }
    public double getbSP() {
        double sum = 0.0;
        for (Land laender:laender) {
            sum += laender.getbSP();
        }return sum;
    }
}
