package Etapa1;

import java.util.Scanner;

public class C06EX05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroin;

        System.out.print(" Digite um número inteiro: ");
        numeroin = teclado.nextInt();

        if (numeroin % 5 == 0 && numeroin % 7 == 0) {
            System.out.println("O número " + numeroin + " é divisível por 5 e por 7.");
        } else {
            System.out.println("O número " + numeroin + " não é divisível por 5 e por 7 ao mesmo tempo.");
        }

        teclado.close();

    }
}
