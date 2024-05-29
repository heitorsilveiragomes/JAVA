package Etapa1;

import java.util.Scanner;

public class C07EX01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int acertos = 0;

        System.out.println("Digite a quantidade de acertos realizada pela pessoa");
        acertos = teclado.nextInt();

        switch (acertos){
            case 1, 2, 3, 4, 5:
                    System.out.println("Nenhum prêmio");
            break;
            case 6, 7, 8, 9, 10:
                    System.out.println("Ganha outro cartão");
            break;
            case 11:
                    System.out.println("Prêmio de R$100,00");
            break;
            case 12:
                    System.out.println("Prêmio de R$1.000,00" );
            break;
            case 13:
                    System.out.println("Prêmio de R$50.000,00");

        }
        teclado.close();
    }
}
