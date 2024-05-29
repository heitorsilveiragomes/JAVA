package Etapa1;

import java.util.Scanner;

public class C06EX06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Double A, B, C, delta, x1, x2;
        System.out.print("Digite o valor de A: ");
        A = teclado.nextDouble();
        System.out.print("Digite o valor de B: ");
        B = teclado.nextDouble();
        System.out.print("Digite o valor de C: ");
        C = teclado.nextDouble();

        // Calculando o valor de delta
        delta = Math.pow(B,2) - 4 * A * C;

        if (delta > 0){
            x1 = (-B + Math.sqrt(delta)) / (2 * A);
            x2 = (-B - Math.sqrt(delta)) / (2 * A);
            System.out.println("Temos 2 raízes reais: x1 = " + x1 + " e x2 = " + x2);
        } else if (delta == 0) {
            x1 = -B / (2 * A);
            System.out.println("A raiz da equação é: x = " + x1);
        }else {
            System.out.println("A equação não possui raízes reais.");
        }
        teclado.close();
    }
}
