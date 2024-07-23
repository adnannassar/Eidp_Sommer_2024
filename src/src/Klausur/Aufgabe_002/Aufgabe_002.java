package src.Klausur.Aufgabe_002;

public class Aufgabe_002 {
    public static void main(String[] args) {
        int[][] A = {{1, 3, 5, 4}, {2, 4, 7, 5, 3}, {5, 3, 4}};
        auswertung(A);
    }

    public static int maximum(int[][] feld) {
        int max = feld[0][0];
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                if (feld[i][j] > max) {
                    max = feld[i][j];
                }
            }
        }
        return max;
    }

    public static boolean enthaelt(int[] feld, int wert) {
        for (int i = 0; i < feld.length; i++) {
            if (feld[i] == wert) {
                return true;
            }
        }
        return false;
    }

    public static void auswertung(int[][] feld) {
        int max = maximum(feld);
        int[][] ergebnisse = new int[max + 1][]; // Arrays zur Speicherung der Zeilenindizes
        int[] counts = new int[max + 1]; // Zähler für die Anzahl der Zeilen pro Wert

        // Initialisieren der Zähler und Ergebnisse Arrays
        for (int i = 0; i <= max; i++) {
            counts[i] = 0;
            ergebnisse[i] = new int[feld.length]; // Maximale Anzahl der Zeilen
        }

        // Iteriere über jede Zeile und jeden Wert in der Zeile
        for (int zeileIndex = 0; zeileIndex < feld.length; zeileIndex++) {
            for (int wert : feld[zeileIndex]) {
                ergebnisse[wert][counts[wert]] = zeileIndex;
                counts[wert]++;
            }
        }

        // Ausgabe der Ergebnisse
        for (int wert = 0; wert <= max; wert++) {
            if (counts[wert] > 0) {
                System.out.print(wert + ": ");
                for (int i = 0; i < counts[wert]; i++) {
                    if (i > 0) {
                        System.out.print(", ");
                    }
                    System.out.print(ergebnisse[wert][i]);
                }
                System.out.println();
            }
        }
    }
}
