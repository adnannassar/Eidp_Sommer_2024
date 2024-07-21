package src.OOP.Classes.NewCurse.MitarbeiterVerwaltung;

public class Geschäftsführer extends Manager {
    private  double zulage;

    public Geschäftsführer(String name, double fgehalt, double provision, double zulage){
        super(name, fgehalt, provision);
        this.zulage = zulage;
    }

    @Override
    public double berechneGehalt() {
        return super.berechneGehalt() + zulage;
    }
}
