package Etapa2;

import javax.swing.*;

public class C08EX24 {
    public static void main(String[] args) {
        double soma = 0;

        for (int i = 1; i <= 99; i += 2) {
            soma += Math.pow(2, i);
        }

        double resultado = (1.0 / 3) * soma;
        System.out.println("O valor da série é: " + resultado);
    }
}