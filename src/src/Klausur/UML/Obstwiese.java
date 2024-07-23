package src.Klausur.UML;

public class Obstwiese {
    private Baum[] bäume;
    private String imBesitzVon;

    public Obstwiese(String imBesitzVon) {
        this.bäume = new Baum[10];
        this.imBesitzVon = imBesitzVon;
    }

    public boolean addBaume(Baum einBaum) {
        for (int i = 0; i < bäume.length; i++) {
            if (bäume[i] == null) {
                bäume[i] = einBaum;
                return true;
            }
        }
        return false;
    }
}
