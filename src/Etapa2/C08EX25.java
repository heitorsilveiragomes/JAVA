package Etapa2;

public class C08EX25 {
    public static void main(String[] args) {
        for (int aux2 = 1; aux2 <= 10; aux2++) {
            for (int aux = 1; aux <= aux2; aux++)
                System.out.print("*");
            System.out.println();
        }
        for (int aux2 = 10; aux2 >= 1; aux2--) {
            for (int aux = 1; aux <= aux2; aux++)
                System.out.print("*");
            System.out.println();
        }

    }
}
