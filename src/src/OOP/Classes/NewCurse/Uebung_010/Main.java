package src.OOP.Classes.NewCurse.Uebung_010;

public class Main {
    public static void main(String[] args) {
        Bruch b1 = new Bruch(7, 6);
        Bruch b2 = new Bruch(2, 3);


        System.out.println("Bruch 1: " + b1.getZähler() + "/" + b1.getNenner());
        System.out.println("Bruch 2: " + b2.getZähler() + "/" + b2.getNenner());

        Bruch b3 = b1.multiplizieren(b2);
        System.out.println("Bruch 3: " + b3.getZähler() + "/" + b3.getNenner());

    }
}
