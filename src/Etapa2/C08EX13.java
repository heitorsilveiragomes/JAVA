package Etapa2;

import java.io.File;
import java.util.Scanner;

public class C08EX13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(C08EX13.class.getResourceAsStream("cidades.txt"));
        int contMaior = 0;
        int contMulher = 0, menorPopu = 0;
        String cidadeMenosr = "";

        for (int i = 1;i <= 5; i++) {
            String cidade = sc.next();
            int populacao = sc.nextInt();
            int eleitores = sc.nextInt();
            int homens = sc.nextInt();
            int mulheres = sc.nextInt();

            System.out.println(cidade + " " + populacao + " " + eleitores + " " + " " + homens + " " + mulheres);
            double porcElei = (float) eleitores / populacao * 100;

            int somHomMul = homens + mulheres;
            if (somHomMul != populacao){
                System.out.println("Homens + Mulheres != População ");
            }


            if (i == 1 || populacao >= 1000000){
                contMaior++;
            }

            if (mulheres > homens){
                contMulher++;
            }



            if (i == 1 || menorPopu > populacao){
                menorPopu = populacao;
                cidadeMenosr = cidade;

            }


            System.out.printf("%.0f%n", porcElei);
            System.out.println(" ");



        }
        System.out.println("Cidades com mais de 1 milhão = " + contMaior);
        System.out.println("Cidade com mais mulheres do que homens = " + contMulher);
        System.out.println("Cidade com menor população = " + cidadeMenosr);

        sc.close();
    }
}
