package ECO10;

import java.util.Scanner;

public class C11EX01 {

    public static double f(double x) {
        return Math.pow(x, 2) + (4 * x - 2) / 5.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o limite superior para x: ");
        int limiteSuperior = scanner.nextInt();

        double somaFx = 0;
        int contador = 0;

        for (int x = 1; x <= limiteSuperior; x += 2) {
            double valorFx = f(x);
            somaFx += valorFx;
            contador++;
            System.out.println("f(" + x + ") = " + valorFx);
        }

        double media = somaFx / contador;
        System.out.println("A média dos valores de f(x) é: " + media);

        scanner.close();
    }
}
