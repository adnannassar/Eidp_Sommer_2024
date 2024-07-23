package src.Klausur.UML;

public class MirabelleBaum extends Baum {

    public MirabelleBaum(String derName) {
        super(derName);
        super.dieSorte = "Mirabelle";
    }

    @Override
    public boolean pruefeObstsorte(Frucht eineFrucht) {
        Stamm stamm = this.getStamm();
        for (int i = 0; i < stamm.getAnzahlZweige(); i++) {
            Zweig zweig = stamm.getZweige(i);
            Frucht[] fruchte = zweig.getFruchte();
            for (int j = 0; j < fruchte.length; j++) {
                if (fruchte[j].equals(eineFrucht) &&
                        eineFrucht.dieSorte.equals("Mirabelle") &&
                        fruchte[j].dieSorte.equals("Mirabelle")
                ) {
                    return true;
                }
            }
        }
        return false;
    }
}
