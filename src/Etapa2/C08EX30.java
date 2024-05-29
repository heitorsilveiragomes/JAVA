package Etapa2;

import java.util.Scanner;

public class C08EX30 {
    public static void main(String[] args) {
        double S = 1, x;
        int n;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor de X:");
        x = teclado.nextDouble();
        System.out.println("Informe o valor de N:");
        n = teclado.nextInt();

        for (int i = 1; i <= n; i++) {
            S += Math.pow(x, i) / i;
        }

        S += Math.log(x);

        System.out.println("O valor da série S é: " + S);
    }
}