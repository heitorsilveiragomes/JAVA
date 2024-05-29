package ETAPA2;

import javax.swing.*;
import java.util.Scanner;

public class C08EX23 {
    public static void main(String[] args) {
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0;
        int contadorpalindromo = 0;
        double somapalindromo = 0, numeropalindromo = 0, media;

        for (int aux = 1000; aux <= 9999; aux++) {
             n1 = aux / 1000;
            n2 = (aux / 100) % 10;
            n3 = (aux / 10) % 10;
            n4 = aux % 10;
            if (n1 == n4 && n2 == n3)
                System.out.println(aux);
            contadorpalindromo++;
            somapalindromo += aux;
        }

        media = somapalindromo / contadorpalindromo;

        JOptionPane.showMessageDialog(null,
                "Os palíndromos são: " + contadorpalindromo + "\n" +
                        "Média dos palíndromos: " + media);
    }
}


