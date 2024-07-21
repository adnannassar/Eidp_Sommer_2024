package src.OOP.Classes.NewCurse.MitarbeiterVerwaltung;

public class Angestellter extends Mitarbeiter {
    private double grundgehalt, ortszuschlag, zulage;

    public Angestellter(String name, double gGehalt, double ortszus, double zulage){
        super(name);
        this.grundgehalt = gGehalt;
        this.ortszuschlag = ortszus;
        this.zulage = zulage;
    }


    @Override
    public double berechneGehalt() {
       return grundgehalt + ortszuschlag + zulage;
    }
}
