package Etapa2;

import java.util.Scanner;

public class C09EX10C {
    public static void main(String[] args) {
        double numero=0,cima,num, den, serie=0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade de termos");
        numero = teclado.nextDouble();

        for (int aux=1; aux<=numero; aux++) {
            num = (aux * 2)- 1;
            den = (aux * 2);
            serie += (num / den);

        }
        serie = 1.0/3.0 * Math.pow(serie,2);
        System.out.print("Valor da Série = "+ serie);
    }
}