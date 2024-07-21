package src.OOP.Classes.NewCurse.MitarbeiterVerwaltung;

public class Arbeiter extends Mitarbeiter implements Student{
    private double stundenlohn, anzahlStunden, überstundenzuschlag, anzahlÜberstunden;

    public Arbeiter(String name, double stdlohn, double anzahlStd, double üstzus) {
        super(name);
        this.stundenlohn = stdlohn;
        this.anzahlStunden = anzahlStd;
        this.überstundenzuschlag = üstzus;
    }

    public void setAnzahlÜberstunden(double anzahlÜberstunden) {
        this.anzahlÜberstunden = anzahlÜberstunden;
    }


    @Override
    public double berechneGehalt() {
        return anzahlStunden * stundenlohn + (überstundenzuschlag * anzahlÜberstunden);
    }

    @Override
    public void coding() {
        System.out.println("Coding of Student");
    }
}
