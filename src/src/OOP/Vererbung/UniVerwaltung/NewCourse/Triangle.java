package src.OOP.Vererbung.UniVerwaltung.NewCourse;

public class Triangle extends Form {
    int a, b, c;

    public Triangle(String name, String color, int a, int b, int c) {
        super(name, color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString() + ", a: " + this.a + ", b: " + this.b + ", c: " + this.c;
    }

    @Override
    public double berechneFläche() {
        return a * b * c;
    }

}
