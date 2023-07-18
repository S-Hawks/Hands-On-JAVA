package area;

public class Tringle extends Shape {
    @Override
    public Double getArea(double h, double w) {
        double area = ( h * w) / 2;
        return area;
    }
}
