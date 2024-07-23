package src.Klausur.UML;

public class BoskopBaum extends Baum {

    public BoskopBaum(String derName) {
        super(derName);
        super.dieSorte = "Boskop-Apfel";
    }

    @Override
    public boolean pruefeObstsorte(Frucht eineFrucht) {
        Stamm stamm = this.getStamm();
        for (int i = 0; i < stamm.getAnzahlZweige(); i++) {
            Zweig zweig = stamm.getZweige(i);
            Frucht[] fruchte = zweig.getFruchte();
            for (int j = 0; j < fruchte.length; j++) {
                if (fruchte[j].equals(eineFrucht) &&
                        eineFrucht.dieSorte.equals("Boskop") &&
                        fruchte[j].dieSorte.equals("Boskop")
                ) {
                    return true;
                }
            }
        }
        return false;
    }
}
