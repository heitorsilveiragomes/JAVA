package Etapa2;

public class C08EX26 {
    public static void main(String[] args) {
        for (int aux = 1; aux <= 10; aux++) {
            if (aux == 1 || aux == 10) {
                for (int aux2 = 1; aux2 <= aux; aux2++) {
                    System.out.print(" * ");
                }
                System.out.println();
            } else {
                System.out.print(" * ");
                for (int aux2 = 1; aux2 <= aux -1; aux2++) {
                    System.out.print("   ");
                }
                System.out.println(" * ");
            }
        }
        for (int aux = 10 - 1; aux >= 1; aux--) {
            if (aux == 1 || aux == 10) {
                for (int aux2 = 1; aux2 <= aux; aux2++) {
                    System.out.print(" * ");
                }
                System.out.println();
            } else {
                System.out.print(" * ");
                for (int aux2 = 1; aux2 <= aux - 2; aux2++) {
                    System.out.print("   ");
                }
                System.out.println(" * ");
            }
        }
    }
}