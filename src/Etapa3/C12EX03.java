package Etapa3;

import java.util.Scanner;

public class C12EX03 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num[] = new int[10], cont=0;

        for (int aux=0; aux<num.length; aux++) {
            System.out.print("Informe um número inteiro: ");
            num[aux] = teclado.nextInt();
        }
        for (int aux=0; aux<num.length; aux++) {
            System.out.println("O valor ao quadrado é: "+ Math.pow(num[aux],2));
        }

    }
}
