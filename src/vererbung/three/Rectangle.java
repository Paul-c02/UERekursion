package vererbung.three;

public class Rectangle extends Figure{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        double result = 2*length + 2*width;
        return result;
    }

    @Override
    public double getArea() {
        double result = length*width;
        return result;
    }
}
