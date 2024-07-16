package src.OOP.Vererbung.UniVerwaltung.NewCourse;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Rectangle", "Red", 5, 10);
        Square square = new Square("Square", "Yellow", 5);
        Circle circle = new Circle("Circle", "Blue", 2.5);
        Triangle triangle = new Triangle("Triangle", "Green", 2, 2, 2);


        System.out.println(rectangle);
        System.out.println(square);
        System.out.println(circle);
        System.out.println(triangle);

        System.out.println("\nFläche von rectangle : " + rectangle.berechneFläche());
        System.out.println("Fläche von square : " + square.berechneFläche());
        System.out.println("Fläche von circle : " + circle.berechneFläche());
        System.out.println("Fläche von triangle : " + triangle.berechneFläche());
    }
}
