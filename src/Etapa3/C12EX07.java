package Etapa3;

import java.util.Scanner;

public class C12EX07 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nome[] = new String[50];
        int nota[] = new int[50];

        for (int aux=0; aux<nome.length; aux++) {
            System.out.print("Informe o nome do aluno = ");
            nome[aux] = teclado.nextLine();

            System.out.print("Informe a nota do aluno = ");
            nota[aux] = teclado.nextInt();
            teclado.nextLine();
        }
        for (int aux=nota.length-1; aux>=0; aux--) {
            if (nota[aux] <= 30)
                System.out.println(nome[aux]+" - Conceito D");
            if (nota[aux] <= 60)
                System.out.println(nome[aux]+" - Conceito C");
            if (nota[aux] <= 80)
                System.out.println(nome[aux]+" - Conceito B");
            else
                System.out.println(nome[aux]+" - Conceito A");
        }
    }
}
