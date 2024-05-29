
package Etapa2;

import java.util.Scanner;

public class C08EX14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int repeticoes;
        String simbolo;

        System.out.println ("Digite um número enter 1 e 20: ");
        repeticoes = scanner.nextInt ();

        if (repeticoes < 1 || repeticoes > 20) {
            System.out.println ("Número inválido");
            return;
        }

        System.out.println ("Digite o símbolo: ");
        simbolo = scanner.next ();

        for (int i = 0; i < repeticoes; i++) {
            for (int j = 0; j < repeticoes; j++) {
                System.out.print (simbolo);
            }
            System.out.println ();
        }
        scanner.close ();
    }
}
