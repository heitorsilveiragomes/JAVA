package Etapa2;

import java.util.Scanner;

public class C09EX11B {
    public static void main(String[] args) {
        double numero=0,cima,num, den, serie=0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade de termos");
        numero = teclado.nextDouble();

        for (int aux=1; aux<=numero; aux++) {
            num = (aux * 3 - 2);
            den = Math.sqrt(3 * aux + 4);
            serie += (num / den);

        }
        serie = 5.0/3.0 * serie;
        System.out.print("Valor da Série = "+ serie);
    }
}
