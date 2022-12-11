package Dokumentenverwaltung;

public class ImageDocument extends Document{
    private int sizeX;
    private int sizeY;
    private String color;

    public ImageDocument(String fileName, int sizeX, int sizeY, String color) {
        super(fileName);
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.color = color;
    }

    @Override
    public String toString() {
        return "ImageDocument{" +
                "sizeX=" + sizeX +
                ", sizeY=" + sizeY +
                ", color='" + color + '\'' +
                ", fileName='" + fileName + '\'' +
                '}';
    }
    public void printDocument(){
        System.out.println(toString());
    }
}
