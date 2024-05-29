package Etapa3;

import java.util.Scanner;

public class C12EX08 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num[] = new int[20];
        int numsoma[] = new int[20];
        int resultado;

        for (int aux=0; aux<num.length; aux++) {
            System.out.print("Informe o números que você deseja fazer a soma "+ (aux + 1)+ ": ");
            num[aux] = teclado.nextInt();
        }

        for (int aux=0; aux<num.length; aux++) {
            resultado = numsoma[aux] + num[aux];
            System.out.println("Soma "+ (aux + 1)+ ": "+ numsoma[aux] + " + " + num[aux + 10] + "=" + resultado);
        }
    }
}

