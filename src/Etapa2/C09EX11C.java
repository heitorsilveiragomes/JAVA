package Etapa2;

import java.util.Scanner;

public class C09EX11C {
    public static void main(String[] args) {
        double numero=0,cima,num, den, serie=0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade de termos");
        numero = teclado.nextDouble();

        for (int aux=1; aux<=numero; aux++) {
            num = (aux * 2 + 1) * Math.sqrt( aux * 4 + 1);
            den = Math.pow(5,aux);
            serie += (num / den);

        }
        serie = Math.pow(serie,2);
        System.out.print("Valor da Série = "+ serie);
    }
}