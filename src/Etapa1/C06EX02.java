package Etapa1;

import java.util.Scanner;

public class C06EX02 {
    public static void main(String[] args) {
        double Poluentes, multaaplicada = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de poluentes emitidos pela empresa: ");
        Poluentes = teclado.nextDouble();
        if (Poluentes <= 1500)
            multaaplicada = 0;

        else {
            if (Poluentes < 3500){
                multaaplicada = 3000;
            }
            else if (Poluentes > 3500) {
                multaaplicada = 5000 * Poluentes;
            }

        }
        System.out.printf("Multa de R$%.2f ", multaaplicada);

        teclado.close();

    }
}



