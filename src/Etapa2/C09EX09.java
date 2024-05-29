package Etapa2;

import java.util.Scanner;

public class C09EX09 {
    public static void main(String[] args) {
        double numero=0,cima,num, den, serie=0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade de termos");
        numero = teclado.nextDouble();

        for (int aux=1; aux<=numero; aux++) {
            num = Math.pow(3,aux +1);
            den = (9 + aux) * Math.sqrt(Math.pow(aux,4));
            serie += (num / den);

        }
        serie = 100 - Math.pow(serie,3);
        System.out.print("Valor da Série = "+ serie);
    }
}