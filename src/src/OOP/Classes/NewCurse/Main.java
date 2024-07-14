package src.OOP.Classes.NewCurse;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Raghad", 1.3f);
        System.out.println(student1.getName());
        changeName(student1);
        System.out.println(student1.getName());

    }

    public static void changeName(Student student) {
        student.setName("XYZ");
    }

}
