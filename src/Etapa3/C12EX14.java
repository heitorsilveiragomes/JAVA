package Etapa3;

import java.util.Scanner;

public class C12EX14 {
    public static void main(String[] args) {
        int bilhetes[] = new int[100];
        int bilhetePesquisa = -1;
        boolean bilheteEncontrado = false;
        Scanner teclado = new Scanner(System.in);

        for (int aux=0; aux<bilhetes.length; aux++) {
            System.out.print("Informe o número do bilhete "+ (aux + 1)+ " : ");
            bilhetes[aux] = teclado.nextInt();
        }
        //FORA DO FOR - Para não ter repetição
        System.out.print("Informe o número do bilhete para pesquisa: ");
        bilhetePesquisa = teclado.nextInt();

        for (int aux=0; aux<bilhetes.length; aux++) {
            if (bilhetes[aux] == bilhetePesquisa) {
                bilheteEncontrado = true;
                break;
            }
        }

        if (bilheteEncontrado) {
            System.out.println("Parabéns, você ganhou o prêmio do Milhão !");
        } else {
            System.out.println("Não foi dessa vez, continue jogando para ganhar o prêmio do Milhão !");
        }
    }
}
