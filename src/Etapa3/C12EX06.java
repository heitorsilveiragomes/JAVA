package Etapa3;

import java.util.Scanner;

public class C12EX06 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int cont;
        String mes[] = new String[12];

        for (int aux=0; aux<mes.length; aux++) {
            System.out.print("Informe o nome do mês: ");
            mes[aux] = teclado.nextLine();
        }
        for (int aux=mes.length - 1; aux>=0; aux--) {
            System.out.println(mes[aux]);
        }

    }
}
