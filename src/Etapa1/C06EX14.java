package Etapa1;

import java.util.Scanner;

public class C06EX14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int digito1, digito2, digito3, digito4, numero;
        System.out.print("Digite um número inteiro de 4 dígitos: ");
        numero = teclado.nextInt();

        if (numero >= 1000 && numero <= 9999) {
            digito1 = numero % 10;
            digito2 = (numero / 10) % 10;
            digito3 = (numero / 100) % 10;
            digito4 = (numero / 1000) % 10;

            System.out.println("Número : " + digito1 + " " + digito2 + " " + digito3 + " " + digito4);
        } else {
            System.out.println("NÚMERO TEM QUE TER 4 DÍGITOS");
        }
        teclado.close();

    }
}
