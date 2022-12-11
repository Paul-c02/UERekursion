package vererbung.one;

public class Demo {
    public static void main(String[] args) {
        GiroKonto k1 = new GiroKonto("Tom Turbo",100);
        System.out.println(k1.kontostand);
        k1.einzahlen(30);
        System.out.println(k1.kontostand);
        k1.auszahlen(130);
        System.out.println(k1.kontostand);
    }
}
