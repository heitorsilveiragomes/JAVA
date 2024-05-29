package Etapa2;

import java.util.Scanner;
public class C08EX17 {
    public static void main(String[] args) {
        int x;
        double fx;

        Scanner teclado = new Scanner(System.in);
        for (int aux = 3; aux <= 12; aux++) {
            fx = Math.sqrt(Math.pow(aux, 2) - 3);
            System.out.println("x = " + aux + " f(x) = " + fx);
        }
        teclado.close();
    }
}