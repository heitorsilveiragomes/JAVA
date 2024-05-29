// C11EX10
import java.util.Scanner;

public class C11EX10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro entre 1 e 9:");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 9) {
            for (int aux = 1; aux <= numero; aux++) {
                for (int i = 1; i <= aux; i++) {
                    System.out.print("EMGE ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Número fora do intervalo especificado.");
        }

        scanner.close();
    }
}
