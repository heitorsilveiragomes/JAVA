package Etapa3;

import java.util.Scanner;

public class C12EX15 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int cont;
        String temp;
        String mes[] = new String[12];

        for (int aux=0; aux<mes.length; aux++) {
            System.out.print("Informe o nome do mês: ");
            mes[aux] = teclado.nextLine();
        }
        for (int aux=0; aux< mes.length - 1; aux++)
            for (int x=0; x< mes.length -1; x++)
                if (mes[x].compareToIgnoreCase(mes[x+1])>0) {
                    temp = mes[x];
                    mes[x] = mes[x+1];
                    mes[x+1] = temp;
                }
        for (int aux=0; aux<mes.length; aux++)
            System.out.println(aux+" - "+mes[aux]);
        teclado.close();
    }
}