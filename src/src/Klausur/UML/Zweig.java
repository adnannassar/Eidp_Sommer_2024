package src.Klausur.UML;

public class Zweig {
    private Blatt[] blätter;
    public Frucht[] fruchte;
    private Stamm stamm;

    public Zweig() {
        this.blätter = new Blatt[8];
        this.fruchte = new Frucht[10];
    }

    public void setStamm(Stamm stamm) {
        this.stamm = stamm;
    }

    public Stamm getStamm() {
        return stamm;
    }

    public boolean addFrucht(Frucht eineFrucht) {
        for (int i = 0; i < fruchte.length; i++) {
            if (fruchte[i] == null && stamm.getBaum().pruefeObstsorte(eineFrucht)) {
                fruchte[i] = eineFrucht;
                return true;
            }
        }
        return false;
    }

    public int getAnzahlFruchte() {
        int count = 0;
        for (int i = 0; i < fruchte.length; i++) {
            if (fruchte[i] != null) {
                count++;
            }
        }
        return count;
    }

    public int getAnzahlBlätter() {
        int count = 0;
        for (int i = 0; i < blätter.length; i++) {
            if (blätter[i] != null) {
                count++;
            }
        }
        return count;
    }


    public boolean addBlatt(Blatt einBlatt) {
        for (int i = 0; i < blätter.length; i++) {
            if (blätter[i] == null) {
                blätter[i] = einBlatt;
                return true;
            }
        }
        return false;
    }

    public Frucht[] getFruchte() {
        return fruchte;
    }
}
