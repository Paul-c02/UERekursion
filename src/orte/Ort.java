package orte;

import java.util.ArrayList;

public class Ort {
    private String name;
    private ArrayList<Ort> nachbarn = new ArrayList<>();

    public Ort(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ort{" +
                "name='" + name + '\'' +
                ", nachbarn=" + nachbarn +
                '}';
    }

    public void addNachbar(Ort o) {
        nachbarn.add(o);
    }

    public boolean hasCircle(Ort o) {
return true;
    }
    public int countHops(Ort o, Ort d){
return 0;
    }
}
