package Etapa2;

import java.util.Scanner;

public class C08EX04 {
        public static void main(String[] args) {

            String nome;
            int totalidade,idade, menoDeIdade=0, maiordeIdade=0;

            Scanner teclado = new Scanner(System.in);


            for (int i = 0; i <= 50 ; i++) {

                System.out.println("Digite o nome do aluno: ");
                nome = teclado.nextLine();

                System.out.println("Digite a idade do aluno: ");
                idade = teclado.nextInt();
                teclado.nextLine(); // PARA RESOLVER BUG

                if (idade <= 18){

                    menoDeIdade++;
                }else {

                    maiordeIdade++;
                }
            }
            System.out.println("Até 18 ->"+ menoDeIdade);
            System.out.println("Acima de 18 ->"+ maiordeIdade);

            teclado.close();
        }
    }
