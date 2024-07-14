package src.OOP.Classes.NewCurse.Uebung_009;

public class Dozent {
    private String name;
    private String lehrgebiet;
    private char geschlecht;
    private boolean dekan = false;

    public Dozent(String name, String lehrgebiet, char geschlecht) {
        this.name = name;
        this.lehrgebiet = lehrgebiet;
        this.geschlecht = geschlecht;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLehrgebiet(String lehrgebiet) {
        this.lehrgebiet = lehrgebiet;
    }

    public void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }

    public void setDekan(boolean dekan) {
        this.dekan = dekan;
    }

    public String getName() {
        return this.name;
    }

    public char getGeschlecht() {
        return geschlecht;
    }

    public String getLehrgebiet() {
        return lehrgebiet;
    }

    public boolean isDekan() {
        return this.dekan;
    }
}

class Main {
    public static void main(String[] args) {
        Dozent dieDozentin = new Dozent("Sheam", "Sheam Nachname", 'W');
        dieDozentin.setLehrgebiet("Mathe");
        Dozent derDekan = new Dozent("Daiko", "nachname", 'M');
        derDekan.setDekan(true);

        System.out.println(derDekan.getName());
        System.out.println(derDekan.getLehrgebiet());
        System.out.println(derDekan.getGeschlecht());
        System.out.println(derDekan.isDekan());
    }
}

