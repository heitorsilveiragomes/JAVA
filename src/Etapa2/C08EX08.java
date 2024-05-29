package Etapa2;

import java.util.Scanner;

public class C08EX08 {
    public static void main(String[] args) {

        int notafinal = 0, totalfaltas, contAprov=0, contReprov=0,soma=0,cont=0,mais16faltas=0;
        double media= 0, somaNota=0;

        Scanner teclado = new Scanner(System.in);


        for (int i = 0; i < 3 ; i++) {

            System.out.println("Digite a nota do aluno: ");
            notafinal = teclado.nextInt();

            System.out.println("Digite o total de faltas do aluno: ");
            totalfaltas = teclado.nextInt();

            if (notafinal < 65 || totalfaltas > 16) {
                System.out.println("O aluno " + "foi reprovado");
                contReprov++;
            } else {
                System.out.println("O aluno foi aprovado");
                contAprov++;

                somaNota += notafinal;
                cont++;
            }
            if (totalfaltas > 16) {
                mais16faltas++;
            }
        }

            media = somaNota /cont;


        System.out.println("Alunos Aprovados: "+contAprov);
        System.out.println("Alunos Reprovados: "+contReprov);
        System.out.println("Média das notas das aprovados: "+media);
        System.out.println("Quantidade de alunos com mais de 16 faltas: "+ mais16faltas );
        teclado.close();
    }
}


