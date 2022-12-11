package vererbung.two;

public class Demo {
    public static void main(String[] args) {
        Bundesland stmk = new Bundesland(15);
        System.out.println(stmk.getbSP());
        Bundesland ktn = new Bundesland(25);
        Bundesland wien = new Bundesland(30);
        Bundesland bgld = new Bundesland(112);
        Bundesstaat at = new Bundesstaat();
        at.addLand(stmk);
        at.addLand(ktn);
        at.addLand(wien);
        at.addLand(bgld);
        System.out.println(at.getbSP());
    }

}
