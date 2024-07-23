package src;

public class Test {
    public static void main(String[] args) {
        int x = 7;
       A(x);
        System.out.println();
        B(x);
    }

    public static void A(int x) {
        if (x == 5) {
            System.out.println("Fünf");
        }
        if (x == 6) {
            System.out.println("Sechs");
        }
        if (x == 7) {
            System.out.println("Sieben");
        } else {
            System.out.println("Anders");
        }
    }

    public static void B(int x) {
        if (x == 5) {
            System.out.println("Fünf");
        } else if (x == 6) {
            System.out.println("Sechs");
        } else if (x == 7) {
            System.out.println("Sieben");
        } else {
            System.out.println("Anders");
        }
    }

    public static void C(int x) {
        switch (x) {
            case 5:
                System.out.println("Fünf");
                break;
            case 6:
                System.out.println("Sechs");
                break;
            case 7:
                System.out.println("Sieben");
                break;
            default:
                System.out.println("Anders");
        }
    }
}