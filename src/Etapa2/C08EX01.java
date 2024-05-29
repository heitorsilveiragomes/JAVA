package Etapa2;

import java.util.Scanner;

public class C08EX01 {
    public static void main(String[] args) {

        int raio, numroAreas = 10;
        double Area;

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < numroAreas; i++) {
            System.out.println("Digite o Raio do círculo: ");
            raio = teclado.nextInt();

            Area = Math.pow(raio,2) * 3.1416;

            System.out.printf("Área = %.2f%n", Area);
        }




        teclado.close();
    }
}
