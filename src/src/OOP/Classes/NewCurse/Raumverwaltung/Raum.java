package src.OOP.Classes.NewCurse.Raumverwaltung;

public class Raum {
    private char trakt, etage;
    private String nummer;
    private Professor professor;

    public Raum(char trakt, char etage, String nummer) {
        this.trakt = trakt;
        this.etage = etage;
        this.nummer = nummer;
    }

    public char getTrakt() {
        return trakt;
    }

    public char getEtage() {
        return etage;
    }

    public String getNummer() {
        return nummer;
    }

    public void setNutzer(Professor professor) {
        this.professor = professor;
    }

    public Professor getNutzer() {
        return professor;
    }

    public void removeNutzer() {
        setNutzer(null);
    }

    @Override
    public String toString() {
        if (professor == null) {
            return trakt + "." + etage + "." + nummer + ":";
        } else {
            return trakt + "." + etage + "." + nummer + ": " + professor.getName();
        }
    }
}
