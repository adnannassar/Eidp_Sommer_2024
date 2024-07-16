package src.OOP.Classes.NewCurse;

public class Student {
    private String name;
    private float note = 0.0f;
    private int id;
    private static int counter = 1;


    public Student(String name, float note) {
        this.name = name;
        this.note = note;
        this.id = counter;
        counter++;
    }

    // getters
    public String getName() {
        return name;
    }

    public float getNote() {
        return note;
    }

    public int getId() {
        return id;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setNote(float note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + ", Name: " + this.name + ", Note: " + this.note;
    }
}
