package Etapa3;

import java.util.Scanner;

public class C12EX10 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nome[] = new String[50];
        int nota[] = new int[50];
        int mediaprova = 0;

        for (int aux=0; aux<nome.length; aux++) {
            System.out.print("Informe o nome do aluno = ");
            nome[aux] = teclado.nextLine();

            System.out.print("Informe a nota do aluno = ");
            nota[aux] = teclado.nextInt();
            teclado.nextLine();

            mediaprova = mediaprova + nota[aux];
        }

        mediaprova = mediaprova / nome.length;

        for (int aux=nota.length-1; aux>=0; aux--) {
            if (nota[aux] >= mediaprova)
                System.out.println(nome[aux]+" Você foi aprovado(a) com a nota = "+nota[aux]);

        }
    }
}
