package Etapa3;

import java.util.Scanner;

public class C12EX13 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nome[] = new String[10];
        int pessoafila = -1;
        String nomePesquisa = null;

        for (int aux=0; aux<nome.length; aux++) {
            System.out.print("Informe o nome da pessoa "+ (aux + 1)+ " : ");
            nome[aux] = teclado.nextLine();
        }
        //FORA DO FOR - Para não ter repetição
        System.out.print("Informe o nome da pessoa para pesquisa: ");
        nomePesquisa = teclado.nextLine();

        //Comparar os nomes da pesquisa com os da lista
        for (int aux=0; aux<nome.length; aux++) {
            if (nome[aux].equals(nomePesquisa)) {
                pessoafila = aux + 1;
                break;
            }
        }

        if (pessoafila != -1) {
            System.out.println("A pessoa " + nomePesquisa + " está na posição " + pessoafila + " da fila.");
        } else {
            System.out.println("A pessoa " + nomePesquisa + " não está na fila.");
        }
    }
}
