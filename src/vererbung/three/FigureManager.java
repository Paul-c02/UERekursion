package vererbung.three;

import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {
    private ArrayList<Figure> figures = new ArrayList<>();

    public FigureManager(ArrayList<Figure> figures) {
        this.figures = figures;
    }

    public void add(Figure f) {
        figures.add(f);
    }

    public double getMaxPerimeter() {
        double max = 0.0;
        for (Figure f : figures) {
            if (f.getPerimeter() > max) {
                max = f.getPerimeter();
            }
        }
        return max;
    }

    public double getAverageAreaSize() {
        double size = 0.0;
        int count = 0;
        for (Figure f : figures) {
            size += f.getArea();
            count++;
        }if (count > 0) {
            return size/count;
        }
        return 0.0;
    }
    public HashMap<String , Double> getAreaSizeByCategories(){
        HashMap<String , Double> cat = new HashMap<>();
        for (Figure f : figures) {
            if(f.getArea()<1000 ){
                double sum;
                if(cat.containsKey("Klein")) sum = cat.get("Klein");
                else sum = 0.0;
                sum += f.getArea();
                cat.put("Klein", sum);
            } else if (f.getArea()<4999) {
                double sum;
                if(cat.containsKey("Mittel")) sum = cat.get("Mittel");
                else sum = 0.0;
                sum += f.getArea();
                cat.put("Mittel", sum);
            } else {
                double sum;
                if(cat.containsKey("Groß")) sum = cat.get("Groß");
                else sum = 0.0;
                sum += f.getArea();
                cat.put("Groß", sum);
            }
        }return cat;
    }

}
