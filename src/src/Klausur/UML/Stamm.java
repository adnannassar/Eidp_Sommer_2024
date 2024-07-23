package src.Klausur.UML;

public class Stamm {
    private String baumName;
    private Baum baum;
    private Zweig[] zweige;

    public Stamm(String baumName, Baum baum) {
        this.baumName = baumName;
        this.baum = baum;
        this.zweige = new Zweig[5];
    }

    public Baum getBaum() {
        return baum;
    }

    public boolean addZweige(Zweig einZweig) {
        for (int i = 0; i < zweige.length; i++) {
            if (zweige[i] == null) {
                zweige[i] = einZweig;
                return true;
            }
        }
        return false;
    }

    public int getAnzahlZweige() {
        int cout = 0;
        for (int i = 0; i < zweige.length; i++) {
            if (zweige[i] != null) {
                cout++;
            }
        }
        return cout;
    }

    public Zweig getZweige(int i) {
        if (i >= 0 && i < zweige.length) {
            return zweige[i];
        }
        return null;
    }
}
