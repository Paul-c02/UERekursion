package Dokumentenverwaltung;

public class TextDocument extends Document{
    private String content;

    public TextDocument(String fileName, String content) {
        super(fileName);
        this.content = content;
    }

    @Override
    public String toString() {
        return "TextDocument{" +
                "content='" + content + '\'' +
                ", fileName='" + fileName + '\'' +
                '}';
    }
    public void printDocument(){
        System.out.println(toString());
    }
}
