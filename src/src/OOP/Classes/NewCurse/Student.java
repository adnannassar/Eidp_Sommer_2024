package src.OOP.Classes.NewCurse;

public class Student {
    private String name;
    private float note = 0.0f;

    public Student(String name, float note) {
        this.name = name;
        this.note = note;
    }


    // getters
    public String getName() {
        return name;
    }

    public float getNote() {
        return note;
    }


    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setNote(float note) {
        this.note = note;
    }
}
