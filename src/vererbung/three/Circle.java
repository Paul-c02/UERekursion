package vererbung.three;

public class Circle extends Figure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double result = Math.PI * radius * radius;
        return result;
    }

    @Override
    public double getPerimeter() {
        double result = 2*Math.PI*radius;
        return result;
    }
}
