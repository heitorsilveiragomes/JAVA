package Etapa1;

import java.util.Scanner;

public class C05EXEXTRA2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double tempo, velocidade, c;
        System.out.print("Informe o tempo gasto (segundos): ");
        tempo = teclado.nextDouble();
        System.out.print("Informe a velocidade do objeto (m/s): ");
        velocidade = teclado.nextDouble();
        c = 3 * Math.pow(10, 8);
        double T = tempo * 1 / Math.sqrt(1 - Math.pow(velocidade, 2) / Math.pow(c, 2));
        System.out.printf("O tempo relativo é %.4f segundos.\n", T);
        teclado.close();
    }
    }


