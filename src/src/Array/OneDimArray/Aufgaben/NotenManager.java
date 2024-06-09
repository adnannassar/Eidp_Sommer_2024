package src.Array.OneDimArray.Aufgaben;

import java.util.Scanner;

public class NotenManager {
    static Scanner scan = new Scanner(System.in);
    static float[] notenArray;

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        int option;
        do {
            showOptions();
            option = scan.nextInt();
            handleOption(option);
        } while (option != 4);
    }

    public static void showOptions() {
        System.out.println("\n################################");
        System.out.println("1- Noten array erstellen");
        System.out.println("2- Note hinzufügen");
        System.out.println("3- Noten ausgaben");
        System.out.println("4- Exit");
        System.out.print("Bitte wählen Sie eine Option aus: ");
    }

    public static void handleOption(int option) {
        switch (option) {
            case 1:
                initArray();
                break;
            case 2:
                addNote();
                break;
            case 3:
                printArray();
                break;
            case 4:
                System.out.println("Programm wurde beendet");
                break;
            default:
                System.out.println("Bitte geben Sie etwas gültiges ein ");
        }
    }

    public static void addNote() {
        if (notenArray == null) {
            System.out.println("Bitte zur erst Noten array erstellen (Option 1)");
        } else {
            if (notenArray[notenArray.length - 1] != 0.0) {
                System.out.println("Ihre erstellen Noten Array is voll! bitte eine neues Array erstellen (Option 1)");
            }
            System.out.print("Bitte die Note eingeben: ");
            float note = scan.nextFloat();
            for (int i = 0; i < notenArray.length; i++) {
                if (notenArray[i] == 0.0) {
                    notenArray[i] = note;
                    break;
                }
            }
        }
    }

    public static void initArray() {
        System.out.print("Bitte die Große des Array eingeben: ");
        int size = scan.nextInt();
        notenArray = new float[size];
        System.out.println("Array wurde erfolgreich mit der Länge (" + size + ") erstellt");
    }

    public static void printArray() {
        if (notenArray == null) {
            System.out.println("Bitte zur erst Noten array erstellen (Option 1)");
        } else {
            System.out.print("Noten [");
            for (int i = 0; i < notenArray.length - 1; i++) {
                System.out.print(notenArray[i] + ",  ");
            }
            System.out.print(notenArray[notenArray.length - 1] + "]");
        }

    }
}
