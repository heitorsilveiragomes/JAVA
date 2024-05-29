package Etapa3;

import java.util.Scanner;

public class C13EX01 {
    public static double CalcularDistancia(double coordenadax,double coordenaday,double coordenadax1,double coordenaday1) {
        return Math.sqrt(Math.pow(coordenadax1 - coordenadax, 2) + Math.pow(coordenaday1 - coordenaday, 2));
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a coordenada X: ");
        double coordenadax = teclado.nextInt();

        System.out.println("Informe a coordenada Y: ");
        double coordenaday = teclado.nextInt();

        System.out.println("Informe a coordenada X(1): ");
        double coordenadax1 = teclado.nextInt();

        System.out.println("Informe a coordenada Y(1): ");
        double coordenaday1 = teclado.nextInt();

        double distancia = CalcularDistancia(coordenadax, coordenaday, coordenadax1, coordenaday1);
        System.out.println("A distância entre os pontos é: " + distancia);
        teclado.close();
    }
}
