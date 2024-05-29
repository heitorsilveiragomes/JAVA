package Etapa2;

import java.util.Scanner;

public class C09EX10B {
    public static void main(String[] args) {
        double numero=0,cima,num, den, serie=0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade de termos");
        numero = teclado.nextDouble();

        for (int aux=1; aux<=numero; aux++) {
            num = (2 * aux);
            den = (3 * aux);
            serie += (num / den);

        }
        serie = 1 + Math.sqrt(serie);
        System.out.print("Valor da Série = "+ serie);
    }
}
