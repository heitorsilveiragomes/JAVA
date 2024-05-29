package Etapa1;

import java.util.Scanner;

public class C07EX04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String Equipes;

        System.out.println("Digite o nome da Equipe de futebol desejada: ");
        Equipes = teclado.nextLine();



        switch (Equipes) {
            case "América": case "Atlético": case "Cruzeiro" : case "Villa Nova":
                System.out.println("O Estado em que a equipe pertence é Minas Gerais");
                break;
            case "Botafogo": case "Flamengo": case "Fluminense": case "Vasco":
                System.out.println("O Estado em que a equipe pertence é Rio de Janeiro");
                break;
            case "Corinthians": case "Palmeiras": case "Santos": case "São Paulo":
                System.out.println("O Estado em que a equipe pertence é São Paulo");
                break;
            case "Grêmio": case "Internacional": case "Juventude":
                System.out.println("O Estado em que a equipe pertence é Rio Grande do Sul");
                break;
            case "Náutico": case "Santa Cruz": case "Sport":
                System.out.println("O Estado em que a equipe pertence é Pernambuco");
                break;

        }

        teclado.close();
    }
}
