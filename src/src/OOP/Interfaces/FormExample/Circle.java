package src.OOP.Interfaces.FormExample;

public class Circle extends Form implements GeoMetricForm {

    private double radius;

    public Circle(String color, String name, double radius) {
        super(color, name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double berechneFläche() {
        return radius * Math.pow(Math.PI, 2);
    }

    @Override
    public void doGeo() {

    }

    @Override
    public int test() {
        return 0;
    }
}
