package src.OOP.Vererbung.UniVerwaltung.NewCourse;

public class Circle extends Form {
    private double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", radius: " + this.radius;
    }

    @Override
    public double berechneFläche() {
        return this.radius * Math.pow(Math.PI, 2);
    }
}
