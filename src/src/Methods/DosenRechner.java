package src.Methods;

import java.util.Scanner;

public class DosenRechner {

    static double radius;
    static double höhe;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        readInput();
        showMenu();
    }

    public static void showMenu() {
        int option;
        do {
            showOptions();
            option = scan.nextInt();
            handleOption(option);
        } while (option != 6);
    }

    public static void handleOption(int option) {
        switch (option) {
            case 1:
                System.out.println("umfang : " + umfang(radius));
                break;
            case 2:
                System.out.println("deckelfläche : " + deckelfläche(radius));
                break;
            case 3:
                System.out.println("mantelfläche : " + mantelfläche(radius, höhe));
                break;
            case 4:
                System.out.println("oberfläche : " + oberfläche(radius, höhe));
                break;
            case 5:
                System.out.println("volumen : " + volumen(radius, höhe));
                break;
            case 6:
                System.out.println("Programm wurde beendet");
                break;
            default:
                System.out.println("Bitte geben Sie etwas gültiges ein ");
        }
    }

    public static void showOptions() {
        System.out.println("\n################################");
        System.out.println("1- Umfang");
        System.out.println("2- Deckelfläche");
        System.out.println("3- Mantelfläche");
        System.out.println("4- Oberfläche");
        System.out.println("5- Volumen");
        System.out.println("6- Exit");
        System.out.print("Bitte wählen Sie eine Option aus: ");
    }

    public static void readInput() {
        System.out.print("Bitte Radius eingebe: ");
        radius = scan.nextDouble();

        System.out.print("Bitte Höhe eingebe: ");
        höhe = scan.nextDouble();
    }

    public static double umfang(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double deckelfläche(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double mantelfläche(double höhe, double radius) {
        return umfang(radius) * höhe;
    }

    public static double oberfläche(double radius, double höhe) {
        return 2 * deckelfläche(radius) + mantelfläche(höhe, radius);
    }

    public static double volumen(double radius, double höhe) {
        return deckelfläche(radius) * höhe;
    }

}
