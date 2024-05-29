package Etapa1;
import java.util.Scanner;

public class C05EXEXTRA1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero,d1,d2,d3,d4;

        System.out.print("Digite um número inteiro de 4 dígitos: ");
         numero = scanner.nextInt();

        // Verifica se o número possui 4 dígitos
        if (numero < 1000 || numero > 9999) {
            System.out.println("Número inválido. Por favor, digite um número de 4 dígitos.");
            return;
        }

        // Extrai os dígitos do número
         d1 = numero / 1000;
         d2 = (numero % 1000) / 100;
         d3 = (numero % 100) / 10;
         d4 = numero % 10;

        // Verifica se é palíndromo
        if (d1 == d4 && d2 == d3) {
            System.out.println("O número " + numero + " é um palíndromo.");
        } else {
            System.out.println("O número " + numero + " não é um palíndromo.");
        }
    }
}

