package src.OOP.Classes.NewCurse.GObject;

public class GEllipse extends GObjekt {
    protected int posX, posY;

    public GEllipse(int posXSuper, int posYSuper, int posX, int posY) {
        super(posXSuper, posYSuper);
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public void zeichnen() {

    }
}
