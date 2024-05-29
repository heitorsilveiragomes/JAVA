package Etapa2;

import java.util.Scanner;

public class C09EX11A {
    public static void main(String[] args) {
        double numero=0,cima,num, den, serie=0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade de termos");
        numero = teclado.nextDouble();

        for (int aux=1; aux<=numero; aux++) {
            num = aux + (7 * aux - 6) ;
            den =   Math.pow(4,aux -1);
            serie += (num / den);
        }
        serie = Math.cbrt(serie);
        System.out.print("Valor da Série = "+ serie);
    }
}