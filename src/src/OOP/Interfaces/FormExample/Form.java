package src.OOP.Interfaces.FormExample;

public abstract class Form {

    private String color;
    private String name;

    public Form(String color, String name) {
        this.color = color;
        this.name = name;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double berechneFläche();
}
