package src.OOP.Classes.NewCurse.Uebung_010;

public class Bruch {
    private int zähler;
    private int nenner;

    public Bruch() {
    }

    public Bruch(int zähler, int nenner) {
        this.zähler = zähler;
        this.nenner = nenner;
    }

    public int getZähler() {
        return zähler;
    }

    public int getNenner() {
        return nenner;
    }

    public Bruch kehrwert() {
        return null;
    }

    public Bruch addieren(Bruch b) {
        return null;
    }

    public Bruch multiplizieren(Bruch b) {
        int ergZähler = this.zähler * b.zähler;
        int ergNenner = this.nenner * b.nenner;
        Bruch erg = new Bruch(ergZähler, ergNenner);
        return erg;
    }

    @Override
    public String toString() {
        return "";
    }

}
