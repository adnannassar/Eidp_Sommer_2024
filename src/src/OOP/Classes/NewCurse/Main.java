package src.OOP.Classes.NewCurse;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Raghad", 1.3f);

        System.out.println(student1.getName());
        System.out.println(student1.getNote());

        student1.setName("Mohamad");
        student1.setNote(1.0f);

        System.out.println(student1.getName());
        System.out.println(student1.getNote());

    }

}
