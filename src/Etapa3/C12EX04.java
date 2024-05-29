package Etapa3;

import java.util.Scanner;

public class C12EX04 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int primeirabateria[] = new int[20], cont=0;
        int segundabateria[] = new int[10];

        System.out.println("Registro de chegada e ordem de largada da primeira bateria");

        for (int aux=0; aux<primeirabateria.length; aux++) {
            System.out.print("Informe o número do corredor que esta na posição: "+ (aux + 1)+ " : ");
            primeirabateria[aux] = teclado.nextInt();
        }

        System.out.println("Registro de chegada e ordem de largada da segunda bateria");

        for (int aux=0; aux<segundabateria.length; aux++) {
            segundabateria[aux] = primeirabateria[aux];
            System.out.println("Dupla"+ (aux + 1)+ ": "+ segundabateria[aux] + " e " + primeirabateria[aux + 10]);
        }
    }
}