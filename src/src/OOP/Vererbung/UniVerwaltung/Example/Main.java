package src.OOP.Vererbung.UniVerwaltung.Example;

public class Main {

    public static void main(String[] args) {
        A a1 = new A(100);
        A a2 = new A(101);

        a1 = a2;
    }

}

class A {
    int x;

    public A(int x) {
        this.x = x;
    }

    public void test() {
        System.out.println("Java From A Class");
    }
}

class B extends A {
    int y;

    public B(int x, int y) {
        super(x);
        this.y = y;
    }

    @Override
    public void test() {
        System.out.println("Java From B Class");
    }
}
