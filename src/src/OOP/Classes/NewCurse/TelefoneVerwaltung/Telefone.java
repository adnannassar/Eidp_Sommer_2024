package src.OOP.Classes.NewCurse.TelefoneVerwaltung;

public class Telefone {
    private int id;
    private String rufnummer;

    public Telefone(int id, String rufnummer) {
        this.id = id;
        this.rufnummer = rufnummer;
    }

    public int getId() {
        return id;
    }

    public String getRufnummer() {
        return rufnummer;
    }

    @Override
    public String toString() {
        return "ID: " + id + " Rufnummer: " + rufnummer;
    }
}
