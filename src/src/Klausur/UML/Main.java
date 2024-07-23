package src.Klausur.UML;

public class Main {
    public static void main(String[] args) {
        BoskopBaum boskopBaum = new BoskopBaum("Boskop_2022");
        Zweig zweig1 = new Zweig();
        zweig1.addBlatt(new Blatt());
        zweig1.addFrucht(new Boskop());
        zweig1.addFrucht(new Boskop());
        Zweig zweig2 = new Zweig();
        zweig2.addBlatt(new Blatt());
        boskopBaum.getStamm().addZweige(zweig1);
        boskopBaum.getStamm().addZweige(zweig2);


        MirabelleBaum mirabelleBaum = new MirabelleBaum("Mirabelle_2020");
        Zweig zweig3 = new Zweig();
        zweig3.addFrucht(new Mirabelle());
        Zweig zweig4 = new Zweig();
        mirabelleBaum.getStamm().addZweige(zweig3);
        mirabelleBaum.getStamm().addZweige(zweig4);

    }
}
