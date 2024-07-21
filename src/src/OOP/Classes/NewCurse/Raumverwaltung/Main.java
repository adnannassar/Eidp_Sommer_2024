package src.OOP.Classes.NewCurse.Raumverwaltung;

public class Main {
    public static void main(String[] args) {
        Raum c230 = new Raum('C', '2', "30");

        Raum c240 = new Raum('C', '2', "40");
        Professor koll = new Professor("Konstantin Koll");
        c240.setNutzer(koll);

        Raum c241 = new Raum('C', '2', "41");
        Professor stark = new Professor("Michael Stark");
        c241.setNutzer(stark);

        Raum a202 = new Raum('A', '2', "02");
        Raum a203 = new Raum('A', '2', "03");


        Raumverwaltung raumverwaltung = new Raumverwaltung();
        raumverwaltung.addRaum(c230);
        raumverwaltung.addRaum(c240);
        raumverwaltung.addRaum(c241);
        raumverwaltung.addRaum(a202);
        raumverwaltung.addRaum(a203);

        raumverwaltung.ausgabeRaumliste();

    }
}
