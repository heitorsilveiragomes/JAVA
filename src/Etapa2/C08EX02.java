package Etapa2;

import java.util.Scanner;

public class C08EX02 {
    public static void main(String[] args) {

        int notafinal, totalfaltas;

        Scanner teclado = new Scanner(System.in);


        for (int i = 0; i <= 50 ; i++) {

            System.out.println("Digite a nota final do aluno: ");
            notafinal = teclado.nextInt();

            System.out.println("Digite o total de faltas do aluno: ");
            totalfaltas = teclado.nextInt();

            if (notafinal < 65 || totalfaltas > 16){
                System.out.println("O aluno "+ "foi reprovado");
            }else {
                System.out.println("O aluno foi aprovado");
            }
        }

        teclado.close();
    }
}

