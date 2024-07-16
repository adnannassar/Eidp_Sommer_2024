package src.OOP.Classes.NewCurse.Uebung_010;

public class Bruch {
    private int zähler;
    private int nenner;

    public Bruch() {
    }

    public Bruch(int zähler, int nenner) {
        this.zähler = zähler;
        this.nenner = nenner;
    }

    public int getZähler() {
        return zähler;
    }

    public int getNenner() {
        return nenner;
    }

    public Bruch kehrwert() {
        Bruch ergBruch = new Bruch(this.nenner, this.zähler);
        return ergBruch;
    }

    public void simplize() {
        int ggt = ggt(this.zähler, this.nenner);
        this.zähler /= ggt;
        this.nenner /= ggt;
    }

    private int ggt(int a, int b) {
        int counterTeilerVonA = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                counterTeilerVonA++;
            }
        }
        int[] teilerVonA = new int[counterTeilerVonA];

        for (int i = 1, index = 0; i <= a; i++) {
            if (a % i == 0) {
                teilerVonA[index] = i;
                index++;
            }
        }

        int counterTeilerVonB = 0;
        for (int i = 1; i <= b; i++) {
            if (a % i == 0) {
                counterTeilerVonB++;
            }
        }
        int[] teilerVonB = new int[counterTeilerVonB];

        for (int i = 1, index = 0; i <= b; i++) {
            if (a % i == 0) {
                teilerVonB[index] = i;
                index++;
            }
        }

        int[] gemeinsamsTeilerArray = new int[teilerVonB.length];

        for (int i = 0, index = 0; i < teilerVonB.length; i++) {
            if (exist(teilerVonB[i], teilerVonA)) {
                gemeinsamsTeilerArray[index] = teilerVonB[i];
                index++;
            }
        }

        return max(gemeinsamsTeilerArray);
    }

    private int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    private boolean exist(int value, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public Bruch addieren(Bruch b) {
        int ergZähler = (this.zähler * b.nenner) + (this.nenner * b.zähler);
        int ergNenner = this.nenner * b.nenner;

        Bruch ergBruch = new Bruch(ergZähler, ergNenner);
        return ergBruch;
    }

    public Bruch multiplizieren(Bruch b) {
        int ergZähler = this.zähler * b.zähler;
        int ergNenner = this.nenner * b.nenner;
        Bruch erg = new Bruch(ergZähler, ergNenner);
        return erg;
    }

    @Override
    public String toString() {
        if (nenner == 1) {
            return String.valueOf(this.zähler);
        }
        return this.zähler + "/" + this.nenner;
    }
}
