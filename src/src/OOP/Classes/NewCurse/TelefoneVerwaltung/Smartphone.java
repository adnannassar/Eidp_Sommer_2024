package src.OOP.Classes.NewCurse.TelefoneVerwaltung;

import java.time.LocalTime;
import java.util.Arrays;

public class Smartphone extends Telefone implements Uhr {
    private double displayGröße;
    private SMS[] messages;

    public Smartphone(int id, String rufnummer, double displayGröße) {
        super(id, rufnummer);
        this.displayGröße = displayGröße;
        this.messages = new SMS[1000];
    }

    public double getDisplayGröße() {
        return displayGröße;
    }

    public int getAnzahlSMS() {
        int cout = 0;
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] != null) {
                cout++;
            }
        }
        return cout;
    }

    public int addSMSReturnPosition(int empfängerID, String text) {
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] == null) {
                messages[i] = new SMS(empfängerID, text);
                return i;
            }
        }
        return -1;
    }

    public int addSMSReturnStatusOrFlag(int empfängerID, String text) {
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] == null) {
                messages[i] = new SMS(empfängerID, text);
                return 1;
            }
        }
        return -1;
    }

    public void addSMSVoid(int empfängerID, String text) {
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] == null) {
                messages[i] = new SMS(empfängerID, text);
                break;
            }
        }
    }

    public void addSMSVoid(SMS sms) {
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] == null) {
                messages[i] = sms;
                break;
            }
        }
    }

    public void ausgabeSMS() {
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] != null) {
                System.out.println(messages[i]);
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Displaygröße: " + displayGröße;
    }

    @Override
    public LocalTime getUhrzeit() {
        return LocalTime.now();
    }
}
