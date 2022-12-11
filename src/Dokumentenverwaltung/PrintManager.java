package Dokumentenverwaltung;

import java.util.ArrayList;

public class PrintManager {
    private ArrayList<Document> documents = new ArrayList<>();

    public PrintManager() {
    }

    public void addDocument(Document d) {
        documents.add(d);
    }

    public void printAll() {
        for (Document d : documents) {
            d.printDocument();
        }
    }
    public Document findDocument(String fileName){
        for (Document d:documents) {
            if(d.getFileName().equals(fileName)) {
                return d;
            }
        }return null;
    }

    @Override
    public String toString() {
        return "PrintManager{" +
                "documents=" + documents +
                '}';
    }
}

