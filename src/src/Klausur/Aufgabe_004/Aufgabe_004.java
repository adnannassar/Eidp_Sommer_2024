package src.Klausur.Aufgabe_004;

public class Aufgabe_004 {

    public static void main(String[] args) {
        System.out.println(sindGleich("ABC", "ABC"));
        System.out.println(getGemeinsamesWort("abcdef", "aabde"));
    }

    public static boolean sindGleich(String u, String v) {
        for (int i = 0; i < u.length(); i++) {
            if (u.charAt(i) != v.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static String getGemeinsamesWort(String u, String v) {
        String erg = "";
        int uLen = u.length();
        int vLen = v.length();
        int len;
        if (uLen == vLen) {
            len = vLen;
        } else if (uLen < vLen) {
            len = uLen;
        } else {
            len = vLen;
        }
        for (int i = 0; i < len; i++) {
            if (u.charAt(i) == v.charAt(i)) {
                erg += u.charAt(i);
            }
        }

        return erg;

    }
}

