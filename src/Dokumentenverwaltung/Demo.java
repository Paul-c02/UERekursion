package Dokumentenverwaltung;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Document d1 = new Document("Doc1");
        TextDocument t1 = new TextDocument("Text1","Hier könnte ihr Text stehen!");
        ImageDocument i1 = new ImageDocument("Image1",1,1,"black");
        ArrayList<String> lines = new ArrayList<>();
        lines.add("line1");
        lines.add("line2");
        lines.add("line3");
        lines.add("line4");
        CsvDocument c1 = new CsvDocument("Csv1", lines);
        d1.printDocument();
        t1.printDocument();
        i1.printDocument();
        c1.printDocument();
        PrintManager p1 = new PrintManager();
        p1.addDocument(d1);
        p1.addDocument(t1);
        p1.addDocument(i1);
        p1.addDocument(c1);
        System.out.println(p1.toString());
        p1.printAll();
        System.out.println(p1.findDocument("depp"));
    }
}
