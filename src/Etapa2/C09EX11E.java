package Etapa2;

import java.util.Scanner;

public class C09EX11E {
    public static void main(String[] args) {
        double numero=0,cima,num, den, serie=0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade de termos");
        numero = teclado.nextDouble();

        for (int aux=1; aux<=numero; aux++) {
            num = (aux * aux) * Math.sqrt(aux * 2 + 3 );
            den = Math.pow(1+aux,aux);
            serie += (num / den);

        }
        serie = 2.0/3.0 * serie;
        System.out.print("Valor da Série = "+ serie);
    }
}
