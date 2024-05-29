package Etapa1;

import java.util.Scanner;

public class C06EX01 {
    public static void main(String[] args) {
        double x, fx = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o valor de (X): ");
        x = teclado.nextDouble();
        if (x < 4)
            fx = (5 * x +3) / Math.sqrt( 16 - Math.pow(x,2));

        else {
            if (x ==4){
                fx = 0;
            }
            else if (x > 4) {
                fx = (5 * x +3) / Math.sqrt(Math.pow(x,2)- 16);
            }

        }

        System.out.println("F(X)"+fx);

        teclado.close();
    }
}
