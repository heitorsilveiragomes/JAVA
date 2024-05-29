import java.util.Scanner;

public class C11EX12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um n�mero inteiro entre 1 e 9:");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 9) {
            for (int aux = 1; aux <= numero; aux++) {
                // Parte crescente da sequ�ncia
                for (int j = 1; j <= aux; j++) {
                    System.out.print(j);
                }
                // Parte decrescente da sequ�ncia
                for (int j = aux - 1; j >= 1; j--) {
                    System.out.print(j);
                }
                System.out.println();
            }
        } else {
            System.out.println("N�mero fora do intervalo especificado.");
        }

        scanner.close();
    }
}