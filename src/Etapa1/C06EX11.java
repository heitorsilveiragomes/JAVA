package Etapa1;

import java.util.Scanner;

public class C06EX11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    String equipe1, equipe2;
    int setsEquipe1, setsEquipe2, pontosequipe1 = 0, pontosequipe2 = 0;

        System.out.print("Digite o nome da Equipe 1: ");
        equipe1 = teclado.nextLine();

        System.out.print("Digite o nome da Equipe 2: ");
         equipe2 = teclado.nextLine();

        System.out.print("Digite os sets ganhos pela Equipe 1: ");
         setsEquipe1 = teclado.nextInt();

        System.out.print("Digite os sets ganhos pela Equipe 2: ");
         setsEquipe2 = teclado.nextInt();

        if ((setsEquipe1 == 3 && setsEquipe2 <= 1) || (setsEquipe1 == 2 && setsEquipe2 == 3)) {
            pontosequipe1 = 3;
            pontosequipe2 = 0;
        } else if (setsEquipe1 == 3 && setsEquipe2 == 2) {
            pontosequipe1 = 2;
            pontosequipe2 = 1;
        }
        System.out.println("Pontos " + equipe1 + "= " + pontosequipe1);
        System.out.println("Pontos " + equipe2 + "= " + pontosequipe2);
        teclado.close();



    }
}
