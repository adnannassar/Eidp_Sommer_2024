package src.Klausur.UML;

public class Mirabelle extends Frucht {
    public Mirabelle() {
        dieSorte = "Mirabelle";
    }

    @Override
    public String getGeschmack() {
        return dieSorte + " Geschmack";
    }
}
