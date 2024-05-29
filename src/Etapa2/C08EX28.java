package Etapa2;

import java.util.Scanner;

public class C08EX28 {
    public static void main(String[] args) {
        int  numeroTriangular=1, soma = 0, contador = 0;
        int n = 1;
        for (int aux = 2; aux <= 1000; aux++) {
            for (; numeroTriangular < aux; n++) {
                numeroTriangular = n * (n + 1) * (n + 2);
            }

            if (numeroTriangular == aux) {
                contador++;
                soma += aux;
                System.out.println(aux);

            }
        }
        double media = soma / contador;
        System.out.println("A média dos números triangulares é: " + media);
    }
}