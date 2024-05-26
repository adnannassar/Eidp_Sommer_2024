package src.Methods;

public class Beispiel {
    public static void main(String[] args) {
       int x =  printMulTable(0, 5);

       if(x == 1){
           System.out.println("printMulTable() wurde erfolgreich aufgerufen!");
       }else {
           System.out.println("FEHLER!");
       }
    }

    public static int printMulTable(int a , int b) {
        if(a == 0){
            return -1;
        }
        for (int i = 1; i <= b; i++) {
            System.out.println("-----------");
            for (int j = 1; j <= 10; j++) {
                mul(i, j);
            }
        }
        return 1;
    }

    public static void mul(int x, int y) {
        int z = x * y;
        System.out.println(x + " * " + y + " = " + z);
    }
}
