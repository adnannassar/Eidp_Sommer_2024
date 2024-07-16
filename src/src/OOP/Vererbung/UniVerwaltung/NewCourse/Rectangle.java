package src.OOP.Vererbung.UniVerwaltung.NewCourse;

public class Rectangle extends Form {
    int width, height;

    public Rectangle(String name, String color, int width, int height) {
        super(name, color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + ", height: " + this.height + ", width: " + this.width;
    }

    @Override
    public double berechneFläche() {
        return this.width * this.height;
    }
}
