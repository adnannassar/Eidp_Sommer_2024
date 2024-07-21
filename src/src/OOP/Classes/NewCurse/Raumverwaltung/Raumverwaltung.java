package src.OOP.Classes.NewCurse.Raumverwaltung;

public class Raumverwaltung {
    private Raum[] räume;

    public Raumverwaltung() {
        this.räume = new Raum[100];
    }

    public void addRaum(Raum raum) {
        for (int i = 0; i < räume.length; i++) {
            if (räume[i] == null) {
                räume[i] = raum;
                break;
            }
        }
    }

    public void ausgabeRaumliste() {
        for (int i = 0; i < räume.length; i++) {
            if (räume[i] != null) {
                System.out.println(räume[i]);
            }
        }
    }
}
