package Etapa2;

import java.util.Scanner;

public class C09EX04 {
        public static void main(String[] args) {
            double numero=0,cima,num, den, serie=0;
            Scanner teclado = new Scanner(System.in);

            System.out.println("Digite a quantidade de termos");
            numero = teclado.nextDouble();

            for (int aux=1; aux<=numero; aux++) {
                num = (4 * aux - 3) * (4 * aux - 2);
                den = (4 * aux - 1 ) * (4 * aux );
                serie += (num / den);
            }
            System.out.print("Valor da Série = "+ Math.sqrt(serie));
        }
    }
