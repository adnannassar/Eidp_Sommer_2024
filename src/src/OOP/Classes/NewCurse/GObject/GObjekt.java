package src.OOP.Classes.NewCurse.GObject;

public abstract class GObjekt {
    private static int objektAnzahl = 0;
    protected int posX;
    protected int posY;

    public GObjekt(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        objektAnzahl++;
    }

    public static void objektHinzufügehn(GObjekt gObjekt){

    }
    public static void objektEntfernen(GObjekt gObjekt){

    }
    public abstract void zeichnen();

}
