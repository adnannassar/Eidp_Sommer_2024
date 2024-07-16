package src.OOP.Classes.NewCurse.Uebung_010;

public class Main {
    public static void main(String[] args) {
        Bruch b1 = new Bruch(7, 6);
        Bruch b2 = new Bruch(2, 3);


        System.out.println("Bruch 1: " + b1);
        System.out.println("Bruch 2: " + b2);

        Bruch b3 = b1.multiplizieren(b2);
        System.out.println("Bruch 3: " + b3);

        Bruch b4 = b1.addieren(b2);
        System.out.println("Bruch 4: " + b4);
        Bruch b5 = b1.kehrwert();
        System.out.println("Kehrwert von Bruch 1: 7/6  --> " + b5);

        Bruch b6 = new Bruch(2, 1);
        System.out.println("Bruch 6: " + b6);

        Bruch b7 = new Bruch(3, 6);
        System.out.println("Bruch 7: " + b7);
        b7.simplize();

        System.out.println("Bruch 7: after simpliz " + b7);
    }
}
