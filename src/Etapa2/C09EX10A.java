package Etapa2;

import java.util.Scanner;

public class C09EX10A {
    public static void main(String[] args) {

        double numero=0,cima,num, den, serie=0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade de termos");
        numero = teclado.nextDouble();

        for (int aux=1; aux<=numero; aux++) {
            num = (aux);
            den = Math.sqrt(2 * aux);
            serie += (num / den);

        }

        System.out.print("Valor da Série = "+ serie);
    }
}
