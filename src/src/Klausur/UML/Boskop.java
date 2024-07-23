package src.Klausur.UML;

public class Boskop extends Frucht{
    public Boskop() {
        dieSorte = "Boskop";
    }

    @Override
    public String getGeschmack() {
        return dieSorte + " Geschmack";
    }
}
