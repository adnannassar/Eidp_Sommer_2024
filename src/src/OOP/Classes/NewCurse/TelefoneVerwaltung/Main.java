package src.OOP.Classes.NewCurse.TelefoneVerwaltung;

public class Main {
    public static void main(String[] args) {

        Smartphone smartphone = new Smartphone(1235123, "01589123123", 6.8);

        smartphone.addSMSVoid(1, "Hallo, wie geht's dir?");
        smartphone.addSMSVoid(2, "Hi, mir geht's gut und selbst?");
        smartphone.addSMSVoid(1, "Super, mir geht's auch gut!");
        smartphone.addSMSVoid(2, "Das freut mich!");

        System.out.println(smartphone + "\n");

        System.out.println("Anzahl SMSs: " + smartphone.getAnzahlSMS());
        System.out.println();

        smartphone.ausgabeSMS();
        System.out.println();


        System.out.println("Uhrzeit: " +
                smartphone.getUhrzeit().getHour() + ":" +
                smartphone.getUhrzeit().getMinute() + ":" +
                smartphone.getUhrzeit().getSecond());


    }
}
