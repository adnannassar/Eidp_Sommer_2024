package src.OOP.Vererbung.UniVerwaltung.NewCourse;

public class Square extends Form {
    int width;

    public Square(String name, String color, int width) {
        super(name, color);
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return super.toString() + ", width: " + this.width;
    }

    @Override
    public double berechneFläche() {
        return this.width * this.width;
    }
}
