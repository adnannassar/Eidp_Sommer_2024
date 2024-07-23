package src.Klausur.UML;

public abstract class Baum {
    protected String dieSorte;
    private Stamm derStamm;

    public Baum(String baumName) {
        this.derStamm = new Stamm(baumName, this);
    }

    public String getSorte() {
        return this.dieSorte;
    }

    public Stamm getStamm() {
        return derStamm;
    }

    public void countBlaetterUndFruechte() {
        int anzahlBlaetter = 0;
        int anzahlFruechte = 0;

        for (int i = 0; i < derStamm.getAnzahlZweige(); i++) {
            anzahlBlaetter += derStamm.getZweige(i).getAnzahlBlätter();
        }

        for (int i = 0; i < derStamm.getAnzahlZweige(); i++) {
            anzahlFruechte += derStamm.getZweige(i).getAnzahlFruchte();
        }


        System.out.println("Anzahl Blaetter " + anzahlBlaetter);
        System.out.println("Anzahl Fruechte " + anzahlFruechte);
    }

    public abstract boolean pruefeObstsorte(Frucht eineFrucht);
}
