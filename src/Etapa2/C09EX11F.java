package Etapa2;

import java.util.Scanner;

public class C09EX11F {
    public static void main(String[] args) {
        double numero=0,cima,num, den, serie=0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade de termos");
        numero = teclado.nextDouble();

        for (int aux=1; aux<=numero; aux++) {
            num = (aux * 2 -1) * Math.pow(2,aux+1);
            den = Math.pow(5*aux -3,2);
            serie += (num / den);

        }
        serie = 5 * Math.sqrt(serie);
        System.out.print("Valor da Série = "+ serie);
    }
}
