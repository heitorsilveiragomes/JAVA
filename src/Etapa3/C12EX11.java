package Etapa3;

import java.util.Scanner;

public class C12EX11 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nome[] = new String[50];
        int nota[] = new int[50];
        int maiornota=0;
        String nomenotamaior = null;

        for (int aux=0; aux<nome.length; aux++) {
            System.out.print("Informe o nome do aluno = ");
            nome[aux] = teclado.nextLine();

            System.out.print("Informe a nota do aluno = ");
            nota[aux] = teclado.nextInt();
            teclado.nextLine();

            if (nota[aux] > maiornota)
                maiornota = nota[aux];
                nomenotamaior = nome[aux];
        }

        System.out.println(nomenotamaior+" Você foi aprovado(a) com a nota = "+maiornota);
    }
}
