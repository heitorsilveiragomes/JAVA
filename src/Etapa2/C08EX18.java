package Etapa2;

import java.util.Scanner;

public class C08EX18   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.print("Digite um número inteiro de 1 a 9: ");
       numero = scanner.nextInt();
        if (numero < 1 || numero > 9) {
            System.out.println("Número inválido. Digite um número de 1 a 9.");
            return;
        }
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + " x " + numero + " = " + (i * numero));
        }
        scanner.close();
    }
}

