package src.OOP.Classes.NewCurse.MitarbeiterVerwaltung;

public class Main {
    public static void main(String[] args) {
        Arbeiter arbeiter = new Arbeiter("Ahmad", 10, 5, 15);
        arbeiter.setAnzahlÜberstunden(2);

        System.out.println(arbeiter.berechneGehalt()+"€");

    }
}
