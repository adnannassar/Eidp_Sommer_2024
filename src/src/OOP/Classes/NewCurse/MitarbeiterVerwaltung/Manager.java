package src.OOP.Classes.NewCurse.MitarbeiterVerwaltung;

public class Manager extends Mitarbeiter {
    private double festgehalt, provision, umsatz;

    public Manager(String name, double fgehalt, double provision) {
        super(name);
        this.festgehalt = fgehalt;
        this.provision = provision;
    }

    public void setUmsatz(double umsatz) {
        this.umsatz = umsatz;
    }


    @Override
    public double berechneGehalt() {
       return festgehalt + provision + umsatz;
    }
}
