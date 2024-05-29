package Etapa1;

import java.util.Scanner;
public class C05EX01 {

    public static void main(String[] args) {
        double fx, x;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor de X: ");
        x = teclado.nextDouble();
        fx = Math.pow(x,3)+ 4*x + 10;
        System.out.println(fx);
        teclado.close();

    }
}
