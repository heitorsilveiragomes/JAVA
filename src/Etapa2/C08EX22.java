package Etapa2;

import javax.swing.*;
import java.util.Scanner;

public class C08EX22 {
    public static void main(String[] args) {
        int primo=0, numero =0;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null,
                "INFORME UM NÚMERO: ",
                "CALCULADORA DE NÚMEROS PRIMOS",
                JOptionPane.INFORMATION_MESSAGE));

        int contadorDivisores = 0;
        for (int aux = 1; aux <= numero; aux++) {
            if (numero % aux == 0) {
                contadorDivisores++;
            }
        }

        if (contadorDivisores == 2) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }
    }
}