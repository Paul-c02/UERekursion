package vererbung.three;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Circle c1 = new Circle(70);
        Circle c2 = new Circle(1400);
        Circle c3 = new Circle(21);
        Circle c4 = new Circle(8);
        Rectangle r1 = new Rectangle(120, 14);
        Rectangle r2 = new Rectangle(4, 3000);
        Rectangle r3 = new Rectangle(7, 14);
        Rectangle r4 = new Rectangle(8, 2);
        System.out.println(c1.getArea());
        System.out.println(c2.getArea());
        System.out.println(c3.getArea());
        System.out.println(c4.getArea());
        System.out.println(r1.getArea());
        System.out.println(r2.getArea());
        System.out.println(r3.getArea());
        System.out.println(r4.getArea());
        System.out.println(r4.getPerimeter());
        System.out.println(r3.getPerimeter());
        System.out.println(r2.getPerimeter());
        System.out.println(r1.getPerimeter());
        System.out.println(c4.getPerimeter());
        System.out.println(c3.getPerimeter());
        System.out.println(c2.getPerimeter());
        System.out.println(c1.getPerimeter());
        ArrayList<Figure> figures = new ArrayList<Figure>();
        figures.add(c1);
        figures.add(c2);
        figures.add(c3);
        figures.add(c4);
        figures.add(r1);
        figures.add(r2);
        figures.add(r3);
        figures.add(r4);
        FigureManager f1 = new FigureManager(figures);
        System.out.println(f1.getAreaSizeByCategories());
        System.out.println(f1.getMaxPerimeter());
        System.out.println(f1.getAverageAreaSize());


    }


}
