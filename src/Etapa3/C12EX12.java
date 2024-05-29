package Etapa3;

import java.util.Scanner;

public class C12EX12 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nome[] = new String[50];
        int nota[] = new int[50];
        int maiornota = 0;
        String nomenotamaior = "";

        for (int aux=0; aux<nome.length; aux++) {
            System.out.print("Informe o nome do aluno = ");
            nome[aux] = teclado.nextLine();

            System.out.print("Informe a nota do aluno = ");
            nota[aux] = teclado.nextInt();
            teclado.nextLine();

            if (nota[aux] > maiornota) { // Check if current student's grade is higher
                maiornota = nota[aux];
                nomenotamaior = nome[aux];
            } else if (nota[aux] == maiornota) {
                nomenotamaior += ", " + nome[aux];
            }
        }

        System.out.println("Os alunos com a maior nota (" + maiornota + ") são: " + nomenotamaior);
    }
}
