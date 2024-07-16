package src.OOP.Vererbung.UniVerwaltung.NewCourse;

public abstract class Form {
    private String name;
    private String color;
    // Blueprint
    public Form(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Color: " + color;
    }

    public abstract double berechneFläche();
}
