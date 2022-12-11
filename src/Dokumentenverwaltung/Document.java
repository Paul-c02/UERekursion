package Dokumentenverwaltung;

public class Document {
    protected String fileName;

    public Document(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    @Override
    public String toString() {
        return "Document{" +
                "fileName='" + fileName + '\'' +
                '}';
    }

    public void printDocument(){
        System.out.println(toString());
    }

}
