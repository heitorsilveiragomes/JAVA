package Etapa2;

import java.util.Scanner;

public class C08EX29 {
        public static void main(String[] args) {
            int x = 0, y = 0;
            long resultado = 1;
            Scanner teclado = new Scanner(System.in);
            System.out.println("Informe o valor de X");
            x = teclado.nextInt();
            System.out.println("Informe o valor de Y");
            y = teclado.nextInt();
            for (int aux = 1; aux <= y; aux++) {
                resultado *= x;
            }
            System.out.println("O resultado de: " + x + "^ " + y + "é" + resultado);
        }
            }

