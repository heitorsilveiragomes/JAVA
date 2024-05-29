package Etapa2;

import java.util.Scanner;

public class C08EX09 {
    public static void main(String[] args) {

        int idade,cont=0,totalIdadeMulheres = 0,totalMulheres = 0,totalIdadeHomens = 0,totalHomens = 0;
        String nome;
        String sexo;
        double mediaidademulheres, mediaidadehomems;


        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do usuário: ");
             nome = teclado.nextLine();

            System.out.println("Digite a idade do usuário: ");
            idade = teclado.nextInt();
            teclado.nextLine();

            System.out.println("Digite (F) para Mulher e (M) para Homem: ");
            sexo = teclado.nextLine();


            if (sexo.equalsIgnoreCase("m")) {
                totalIdadeHomens += idade;
                totalHomens++;
            } else if (sexo.equalsIgnoreCase("f")) {
                totalIdadeMulheres += idade;
                totalMulheres++;
            } else {
                System.out.println("Sexo inválido. Digite M para masculino ou F para feminino.");
                i--;
            }

            //FALTA O CALCULO DAS MEDIAS





        }


        mediaidademulheres = (double) totalIdadeMulheres / totalMulheres;
        mediaidadehomems = (double) totalIdadeHomens / totalHomens;

        System.out.println("Idade média dos homens: " + mediaidadehomems);
        System.out.println("Idade média das mulheres: " + mediaidademulheres);

        teclado.close();


    }
}
