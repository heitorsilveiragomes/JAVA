package Etapa2;

import java.util.Scanner;

public class C08EX07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int idade=0, alunosate12=0, alunosacima30=0,soma=0,cont=0;
        String nome;
        double media = 0;

        for (int i = 0; i < 5; i++) {
            //Pergunta ao usuário
            System.out.println("Digite o seu nome:");
            nome = teclado.nextLine();



            System.out.println("Digite a sua idade:");
            idade = teclado.nextInt();
            teclado.nextLine();

            soma += idade;


            if (idade <= 12){
                alunosate12++;
            } else if (idade >= 30) {
                alunosacima30++;
            }

            cont++;

            media = (double) soma /cont;

        }
        System.out.println("Alunos menores de 12 anos: "+ alunosate12);
        System.out.println("Alunos maiores de 30 anos: "+ alunosacima30);
        System.out.println("Media da idade dos alunos: "+media);



    }
}
