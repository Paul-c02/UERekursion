package Dokumentenverwaltung;

import java.util.ArrayList;

public class CsvDocument extends Document{
    private ArrayList<String> lines = new ArrayList<>();

    public CsvDocument(String fileName, ArrayList<String> lines) {
        super(fileName);
        this.lines = lines;
    }

    @Override
    public String toString() {
        return "CsvDocument{" +
                "lines=" + lines +
                ", fileName='" + fileName + '\'' +
                '}';
    }
    public void printDocument(){
        System.out.println(toString());
    }
    public void addLine(String line){
        lines.add(line);
    }
}
