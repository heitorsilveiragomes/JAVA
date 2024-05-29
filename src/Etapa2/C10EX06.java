package org.example.etapa2;

import java.util.Scanner;

public class C10EX06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, B, C, Xo, Yo, distancia;

        System.out.println("Digite o valor de A: ");
        A = sc.nextDouble();

        System.out.println("Digite o valor de B: ");
        B = sc.nextDouble();

        System.out.println("Digite o valor de C: ");
        C = sc.nextDouble();

        do {
            System.out.println("Digite a coordenada Xo do ponto P: ");
            Xo = sc.nextDouble();

            System.out.println("Digite a coordenada Yo do ponto P: ");
            Yo = sc.nextDouble();

            distancia = Math.abs((A * Xo + B * Yo + C) / Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2)));

            if (distancia == 0) {
                System.out.println("O ponto P que coincide com a reta R tem as coordenadas: (" + Xo + ", " + Yo + ")");
            }
        } while (distancia != 0);
    }
}