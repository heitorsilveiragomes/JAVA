package Etapa2;

import java.util.Scanner;

public class C09EX12 {
    public static void main(String[] args) {
        double numero=0,cima,num=1, den, serie=0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade de termos");
        numero = teclado.nextDouble();

        for (int aux=1; aux<=numero; aux++) {
            den = 2*aux-1;
            if (aux % 2 == 0) {
                serie -= num / den;
            } else {
                serie += num / den;
            }

        }
       serie *= 4;
        System.out.print("Valor da Série = "+ serie);
    }
}